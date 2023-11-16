package com.raven.swing.table;

import com.raven.model.ModelPhieuNhapChiTiet;

public class ModelActionPhieuNhapChiTiet {

    public ModelPhieuNhapChiTiet getPnct() {
        return pnct;
    }

    public void setPnct(ModelPhieuNhapChiTiet pnct) {
        this.pnct = pnct;
    }

    public EventActionPhieuNhapChiTiet getEventPhieuNhapChiTiet() {
        return eventPhieuNhapChiTiet;
    }

    public void setEventPhieuNhapChiTiet(EventActionPhieuNhapChiTiet eventPhieuNhapChiTiet) {
        this.eventPhieuNhapChiTiet = eventPhieuNhapChiTiet;
    }

    public ModelActionPhieuNhapChiTiet(ModelPhieuNhapChiTiet pnct, EventActionPhieuNhapChiTiet eventPhieuNhapChiTiet) {
        this.pnct = pnct;
        this.eventPhieuNhapChiTiet = eventPhieuNhapChiTiet;
    }

    public ModelActionPhieuNhapChiTiet() {
    }

    private ModelPhieuNhapChiTiet pnct;
    private EventActionPhieuNhapChiTiet eventPhieuNhapChiTiet;
}
