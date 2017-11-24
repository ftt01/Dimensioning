package org.altervista.growworkinghard.jswmm;

import oms3.annotations.Execute;

public class LinkDimensioning {

    AbstractMaxDischarge maximum;
    AbstractDimensioning dimensionCalculator;

    @Execute
    public void run() {
        evaluateMaximum();
        dimensionCalculator.evaluateDiameter();
    }

    private void evaluateMaximum() {
        maximum.interpolateCurves();
        maximum.getMaximum();
    }
}