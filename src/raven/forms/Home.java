package raven.forms;

import uk.co.caprica.vlcj.factory.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.base.MediaPlayer;
import uk.co.caprica.vlcj.player.base.MediaPlayerEventAdapter;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Home extends JPanel {

    private List<ModelLocation> locations;
    private int index = 0;
    private HomeOverlay homeOverlay;

    private MediaPlayerFactory factory;
    private EmbeddedMediaPlayer mediaPlayer;

    public Home() {
        init();
        testData();
    }

    private void init() {
        factory = new MediaPlayerFactory();
        mediaPlayer = factory.mediaPlayers().newEmbeddedMediaPlayer();
        Canvas canvas = new Canvas();
        mediaPlayer.videoSurface().set(factory.videoSurfaces().newVideoSurface(canvas));
        mediaPlayer.events().addMediaPlayerEventListener(new MediaPlayerEventAdapter() {
            @Override
            public void timeChanged(MediaPlayer mediaPlayer, long newTime) {
                if (newTime >= mediaPlayer.status().length() - 1000) {
                    mediaPlayer.controls().setPosition(0);
                }
            }
        });
        setLayout(new BorderLayout());
        add(canvas);
    }

    private void testData() {
        locations = new ArrayList<>();
        locations.add(new ModelLocation("Chọn quà, chọn yêu thương tại đây",
                "Cửa hàng chúng tôi là điểm đến lý tưởng để tìm kiếm những món quà lưu niệm độc đáo và ý nghĩa. Với một sự đa dạng vô song, từ đồ trang trí đến đồ điện tử, chúng tôi cam kết mang đến cho khách hàng những trải nghiệm mua sắm không thể quên. Hãy ghé thăm cửa hàng của chúng tôi để tìm kiếm những món quà tặng độc đáo cho mọi dịp!",
                "video/video 1.mp4"));

        locations.add(new ModelLocation("Quà tặng ý nghĩa, từ trái tim đến tay bạn",
                "Khám phá không gian thần tiên của chúng tôi, nơi những món quà lưu niệm độc đáo và ý nghĩa đang chờ đón bạn. Từ đồ trang trí đến đồ điện tử, chúng tôi không chỉ mang đến sự đa dạng mà còn tạo ra những kí ức không gian mua sắm đặc sắc. Ghé thăm cửa hàng của chúng tôi và khám phá nguồn cảm hứng cho mọi dịp!",
                "video/video 2.mp4"));

        locations.add(new ModelLocation("Quà tặng, ngôn ngữ của tình yêu và trân trọng",
                "Tại cửa hàng của chúng tôi, bạn sẽ khám phá không gian tràn ngập những món quà lưu niệm độc đáo và ý nghĩa. Với sự đa dạng từ đồ trang trí đến đồ điện tử, chúng tôi hứa hẹn một hành trình mua sắm đặc biệt, nơi mà mỗi sản phẩm kể một câu chuyện riêng và mỗi chuyến ghé thăm là một trải nghiệm không quên.",
                "video/video 3.mp4"));
    }

    public void initOverlay(JFrame frame) {
        homeOverlay = new HomeOverlay(frame, locations);
        homeOverlay.getOverlay().setEventHomeOverlay(index1 -> {
            play(index1);
        });
        mediaPlayer.overlay().set(homeOverlay);
        mediaPlayer.overlay().enable(true);
    }

    public void play(int index) {
        this.index = index;
        ModelLocation location = locations.get(index);
        if (mediaPlayer.status().isPlaying()) {
            mediaPlayer.controls().stop();
        }
        mediaPlayer.media().play(location.getVideoPath());
        mediaPlayer.controls().play();
        homeOverlay.getOverlay().setIndex(index);
    }

    public void stop() {
        mediaPlayer.controls().stop();
        mediaPlayer.release();
        factory.release();
    }
}
