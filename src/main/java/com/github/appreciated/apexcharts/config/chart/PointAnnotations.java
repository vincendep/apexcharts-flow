package com.github.appreciated.apexcharts.config.chart;

import com.github.appreciated.apexcharts.config.annotations.AnnotationLabel;

public class PointAnnotations {
    double x;
    double y;
    double yAxisIndex;
    double seriesIndex;
    Marker marker;
    AnnotationLabel label;

    class Marker {
        double size;
        String fillColor;
        String strokeColor;
        double strokeWidth;
        String shape;
        double offsetX;
        double offsetY;
        double radius;
        String cssClass;
    }
}