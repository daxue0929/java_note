/*
 * Copyright (c) 2011, 2014, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package javafx.scene.control;

/**
Builder class for javafx.scene.control.ListView
@see javafx.scene.control.ListView
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class ListViewBuilder<T, B extends javafx.scene.control.ListViewBuilder<T, B>> extends javafx.scene.control.ControlBuilder<B> implements javafx.util.Builder<javafx.scene.control.ListView<T>> {
    protected ListViewBuilder() {
    }

    /** Creates a new instance of ListViewBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static <T> javafx.scene.control.ListViewBuilder<T, ?> create() {
        return new javafx.scene.control.ListViewBuilder();
    }

    private int __set;
    private void __set(int i) {
        __set |= 1 << i;
    }
    public void applyTo(javafx.scene.control.ListView<T> x) {
        super.applyTo(x);
        int set = __set;
        while (set != 0) {
            int i = Integer.numberOfTrailingZeros(set);
            set &= ~(1 << i);
            switch (i) {
                case 0: x.setCellFactory(this.cellFactory); break;
                case 1: x.setEditable(this.editable); break;
                case 2: x.setFocusModel(this.focusModel); break;
                case 3: x.setItems(this.items); break;
                case 4: x.setOnEditCancel(this.onEditCancel); break;
                case 5: x.setOnEditCommit(this.onEditCommit); break;
                case 6: x.setOnEditStart(this.onEditStart); break;
                case 7: x.setOrientation(this.orientation); break;
                case 8: x.setSelectionModel(this.selectionModel); break;
            }
        }
    }

    private javafx.util.Callback<javafx.scene.control.ListView<T>,javafx.scene.control.ListCell<T>> cellFactory;
    /**
    Set the value of the {@link javafx.scene.control.ListView#getCellFactory() cellFactory} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B cellFactory(javafx.util.Callback<javafx.scene.control.ListView<T>,javafx.scene.control.ListCell<T>> x) {
        this.cellFactory = x;
        __set(0);
        return (B) this;
    }

    private boolean editable;
    /**
    Set the value of the {@link javafx.scene.control.ListView#isEditable() editable} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B editable(boolean x) {
        this.editable = x;
        __set(1);
        return (B) this;
    }

    private javafx.scene.control.FocusModel<T> focusModel;
    /**
    Set the value of the {@link javafx.scene.control.ListView#getFocusModel() focusModel} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B focusModel(javafx.scene.control.FocusModel<T> x) {
        this.focusModel = x;
        __set(2);
        return (B) this;
    }

    private javafx.collections.ObservableList<T> items;
    /**
    Set the value of the {@link javafx.scene.control.ListView#getItems() items} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B items(javafx.collections.ObservableList<T> x) {
        this.items = x;
        __set(3);
        return (B) this;
    }

    private javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> onEditCancel;
    /**
    Set the value of the {@link javafx.scene.control.ListView#getOnEditCancel() onEditCancel} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B onEditCancel(javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> x) {
        this.onEditCancel = x;
        __set(4);
        return (B) this;
    }

    private javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> onEditCommit;
    /**
    Set the value of the {@link javafx.scene.control.ListView#getOnEditCommit() onEditCommit} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B onEditCommit(javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> x) {
        this.onEditCommit = x;
        __set(5);
        return (B) this;
    }

    private javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> onEditStart;
    /**
    Set the value of the {@link javafx.scene.control.ListView#getOnEditStart() onEditStart} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B onEditStart(javafx.event.EventHandler<javafx.scene.control.ListView.EditEvent<T>> x) {
        this.onEditStart = x;
        __set(6);
        return (B) this;
    }

    private javafx.geometry.Orientation orientation;
    /**
    Set the value of the {@link javafx.scene.control.ListView#getOrientation() orientation} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B orientation(javafx.geometry.Orientation x) {
        this.orientation = x;
        __set(7);
        return (B) this;
    }

    private javafx.scene.control.MultipleSelectionModel<T> selectionModel;
    /**
    Set the value of the {@link javafx.scene.control.ListView#getSelectionModel() selectionModel} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B selectionModel(javafx.scene.control.MultipleSelectionModel<T> x) {
        this.selectionModel = x;
        __set(8);
        return (B) this;
    }

    /**
    Make an instance of {@link javafx.scene.control.ListView} based on the properties set on this builder.
    */
    public javafx.scene.control.ListView<T> build() {
        javafx.scene.control.ListView<T> x = new javafx.scene.control.ListView<T>();
        applyTo(x);
        return x;
    }
}
