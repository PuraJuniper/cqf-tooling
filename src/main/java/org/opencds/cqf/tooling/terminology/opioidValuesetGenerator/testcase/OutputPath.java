package org.opencds.cqf.tooling.terminology.opioidValuesetGenerator.testcase;

public enum OutputPath {

    PATIENT("Patient/");

    private String output;

    OutputPath(String output) {
        this.output = output;
    }

    public String getOutput() {
        return output;
    }

}
