package com.example.lab62.pojo;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Wizards {
    private ArrayList<Wizard> model;
    public ArrayList<Wizard> getModel() {
        return model;
    }
    public void setModel(ArrayList<Wizard> model) {
        this.model = model;
    }
}
