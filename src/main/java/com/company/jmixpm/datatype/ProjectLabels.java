package com.company.jmixpm.datatype;

import com.company.jmixpm.validation.ProjectLabelsSizeValidator;

import javax.validation.Constraint;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

public class ProjectLabels implements Serializable {

    private final List<String> labels;

    public ProjectLabels(List<String> labels) {
        this.labels = labels;
    }

    public List<String> getLabels() {
        return Collections.unmodifiableList(labels);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectLabels that = (ProjectLabels) o;

        return labels.equals(that.labels);
    }

    @Override
    public int hashCode() {
        return labels.hashCode();
    }
}
