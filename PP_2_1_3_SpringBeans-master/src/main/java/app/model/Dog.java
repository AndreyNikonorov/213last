package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

public class Dog extends Animal{
    public String toString(){
      return "i'm a Dog";
    }


}
