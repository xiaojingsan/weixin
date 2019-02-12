package com.example.library.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@EqualsAndHashCode
public class ReportDataBean {
    private List<String> categories;
     private List<Integer> data;
     public List<String> getCategories() {
                 return categories;
             }
     public void setCategories(List<String> categories) {
                 this.categories = categories;
             }
     public List<Integer> getData() {
                 return data;
             }
     public void setData(List<Integer> data) {
                 this.data = data;
             }
 }

