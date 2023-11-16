/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.swing.table;

import com.raven.model.ModelKhuyenMai;

/**
 *
 * @author phand
 */
public class ModelActionKM {

    public ModelKhuyenMai getKhuyenMai() {
        return khuyenMai;
    }

    public void setKhuyenMai(ModelKhuyenMai khuyenMai) {
        this.khuyenMai = khuyenMai;
    }

    public EventActionKM getEvent() {
        return event;
    }

    public void setEvent(EventActionKM event) {
        this.event = event;
    }

    public ModelActionKM(ModelKhuyenMai khuyenMai, EventActionKM event) {
        this.khuyenMai = khuyenMai;
        this.event = event;
    }

    public ModelActionKM() {
    }
    
    private ModelKhuyenMai khuyenMai;
    private EventActionKM event;
}
