package org.arbiter.optimize.ui.components;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class RenderableComponentTable extends RenderableComponent {

    public static final String COMPONENT_TYPE = "simpletable";

    public RenderableComponentTable(){
        super(COMPONENT_TYPE);

    }

    private String[] header;
    private String[][] table;




}
