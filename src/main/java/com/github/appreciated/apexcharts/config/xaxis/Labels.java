package com.github.appreciated.apexcharts.config.xaxis;

import com.github.appreciated.apexcharts.config.xaxis.labels.DatetimeFormatter;
import com.github.appreciated.apexcharts.config.xaxis.labels.Style;

public class Labels {
    Boolean show;
    Double rotate;
    Boolean rotateAlways;
    Boolean hideOverlappingLabels;
    Boolean showDuplicates;
    Boolean trim;
    Double minHeight;
    Double maxHeight;
    Style style;
    Double offsetX;
    Double offsetY;
    String format;

    String formatter;
    DatetimeFormatter datetimeFormatter;

    public Boolean getShow() {
        return show;
    }

    public void setShow(Boolean show) {
        this.show = show;
    }

    public Double getRotate() {
        return rotate;
    }

    public void setRotate(Double rotate) {
        this.rotate = rotate;
    }

    public Boolean getRotateAlways() {
        return rotateAlways;
    }

    public void setRotateAlways(Boolean rotateAlways) {
        this.rotateAlways = rotateAlways;
    }

    public Boolean getHideOverlappingLabels() {
        return hideOverlappingLabels;
    }

    public void setHideOverlappingLabels(Boolean hideOverlappingLabels) {
        this.hideOverlappingLabels = hideOverlappingLabels;
    }

    public Boolean getShowDuplicates() {
        return showDuplicates;
    }

    public void setShowDuplicates(Boolean showDuplicates) {
        this.showDuplicates = showDuplicates;
    }

    public Boolean getTrim() {
        return trim;
    }

    public void setTrim(Boolean trim) {
        this.trim = trim;
    }

    public Double getMinHeight() {
        return minHeight;
    }

    public void setMinHeight(Double minHeight) {
        this.minHeight = minHeight;
    }

    public Double getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(Double maxHeight) {
        this.maxHeight = maxHeight;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }

    public Double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getFormatter() {
        return formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public DatetimeFormatter getDatetimeFormatter() {
        return datetimeFormatter;
    }

    public void setDatetimeFormatter(DatetimeFormatter datetimeFormatter) {
        this.datetimeFormatter = datetimeFormatter;
    }
}
