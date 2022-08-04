# DataBinding

DataBinding and ViewBinding

1)What is Databinding.

A)Data Binding Library is asupport library that allows you to 
  bind UI components in your layouts to data source in your app 
  using a declarative format rather than programatically.

2)What is viewbinding.
A)View binding is feature that allows you to more easily write
  code that interacts with views.Once view binding is enabled
  in a module, it generates a binding class for each XML layout file
  present in that module. An instance of binding class contains
  direct reference to all Views that have an ID in the corresponding 
  layout.

3)What is binding adapters.
A)Binding adapters are responseble for making appropriate framework calls
  to set the values. And databinding we have a "TwoWay Databinding".

4)What is TwowayDataBinding.
A)Technique of binding your objects to your XML layouts so that both the object
  can send data to the layout, and the layout can send data to the object.

5)ViewBinding does not support "Layout Variables", "Layout expressions"
  "Twoway Databinding"

6)What is Alias.
A)Whenever we get Calss Name conflict error user alias name.

  ex:   <import type="android.view.View"/>
        <import type="com.example.databinding.View" alias="MyView"/>
        <import type="com.example.databinding.User"/>


