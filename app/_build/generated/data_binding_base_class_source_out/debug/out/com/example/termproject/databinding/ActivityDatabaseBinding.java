// Generated by view binder compiler. Do not edit!
package com.example.termproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.termproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDatabaseBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button AddProduct;

  @NonNull
  public final Button DeleteProduct;

  @NonNull
  public final TextView EnterID;

  @NonNull
  public final TextView EnterName;

  @NonNull
  public final TextView EnterType;

  @NonNull
  public final Button FindProduct;

  @NonNull
  public final TextView UserID;

  @NonNull
  public final EditText UserName;

  @NonNull
  public final EditText UserType;

  @NonNull
  public final ListView listView;

  @NonNull
  public final TableLayout tableLayout;

  private ActivityDatabaseBinding(@NonNull ConstraintLayout rootView, @NonNull Button AddProduct,
      @NonNull Button DeleteProduct, @NonNull TextView EnterID, @NonNull TextView EnterName,
      @NonNull TextView EnterType, @NonNull Button FindProduct, @NonNull TextView UserID,
      @NonNull EditText UserName, @NonNull EditText UserType, @NonNull ListView listView,
      @NonNull TableLayout tableLayout) {
    this.rootView = rootView;
    this.AddProduct = AddProduct;
    this.DeleteProduct = DeleteProduct;
    this.EnterID = EnterID;
    this.EnterName = EnterName;
    this.EnterType = EnterType;
    this.FindProduct = FindProduct;
    this.UserID = UserID;
    this.UserName = UserName;
    this.UserType = UserType;
    this.listView = listView;
    this.tableLayout = tableLayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDatabaseBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDatabaseBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_database, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDatabaseBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.AddProduct;
      Button AddProduct = ViewBindings.findChildViewById(rootView, id);
      if (AddProduct == null) {
        break missingId;
      }

      id = R.id.DeleteProduct;
      Button DeleteProduct = ViewBindings.findChildViewById(rootView, id);
      if (DeleteProduct == null) {
        break missingId;
      }

      id = R.id.EnterID;
      TextView EnterID = ViewBindings.findChildViewById(rootView, id);
      if (EnterID == null) {
        break missingId;
      }

      id = R.id.EnterName;
      TextView EnterName = ViewBindings.findChildViewById(rootView, id);
      if (EnterName == null) {
        break missingId;
      }

      id = R.id.EnterType;
      TextView EnterType = ViewBindings.findChildViewById(rootView, id);
      if (EnterType == null) {
        break missingId;
      }

      id = R.id.FindProduct;
      Button FindProduct = ViewBindings.findChildViewById(rootView, id);
      if (FindProduct == null) {
        break missingId;
      }

      id = R.id.UserID;
      TextView UserID = ViewBindings.findChildViewById(rootView, id);
      if (UserID == null) {
        break missingId;
      }

      id = R.id.UserName;
      EditText UserName = ViewBindings.findChildViewById(rootView, id);
      if (UserName == null) {
        break missingId;
      }

      id = R.id.UserType;
      EditText UserType = ViewBindings.findChildViewById(rootView, id);
      if (UserType == null) {
        break missingId;
      }

      id = R.id.listView;
      ListView listView = ViewBindings.findChildViewById(rootView, id);
      if (listView == null) {
        break missingId;
      }

      id = R.id.tableLayout;
      TableLayout tableLayout = ViewBindings.findChildViewById(rootView, id);
      if (tableLayout == null) {
        break missingId;
      }

      return new ActivityDatabaseBinding((ConstraintLayout) rootView, AddProduct, DeleteProduct,
          EnterID, EnterName, EnterType, FindProduct, UserID, UserName, UserType, listView,
          tableLayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}