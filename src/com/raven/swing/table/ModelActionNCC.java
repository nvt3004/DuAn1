/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.swing.table;

import com.raven.model.ModelNhaCungCap;
/**
 *
 * @author phand
 */
public class ModelActionNCC {

    public ModelNhaCungCap getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(ModelNhaCungCap nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public EventActionNCC getEvent() {
        return event;
    }

    public void setEvent(EventActionNCC event) {
        this.event = event;
    }

    public ModelActionNCC() {
    }

    public ModelActionNCC(ModelNhaCungCap nhaCungCap, EventActionNCC event) {
        this.nhaCungCap = nhaCungCap;
        this.event = event;
    }
    
    private ModelNhaCungCap nhaCungCap;
    private EventActionNCC event;
}
