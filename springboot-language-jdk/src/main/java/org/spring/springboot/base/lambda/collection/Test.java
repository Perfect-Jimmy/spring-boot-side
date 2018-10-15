package org.spring.springboot.base.lambda.collection;

/**
 * Created by mongoding on 2018/1/11.
 */
public class Test {
    public static void main(String[] args) {
        MyCollection collection = CollectionFactory.create(MyList::new);
        System.out.println(collection.notRequired());

        collection = CollectionFactory.create(NewList::new);
        System.out.println(collection.notRequired());
    }
}
