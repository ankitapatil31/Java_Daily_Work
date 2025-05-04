hashcode ha fkta 1 vela ch calculate hoto jevha put opration hot.. base on that
key hashcode create houn tya node ch hashcode section made add kela jato... 

suppose jar apan tya object la update kela new value ne tr tevha base on that object 
new hashcode calculate hoto but...
pan tya node made ajun pan junach hashcode store aslya mule to null return karto

        student s1 = new student("ankita",1);
        student s2 = new student("ankita",1);
        System.out.println(s1.hashCode()); // 855189302
        s1.setName("Ashuuu");
        System.out.println(map.get(s1)); // null
        System.out.println(s1.hashCode()); // 950198243


so new hashcode not in hashmap.. and that is the problem...
that why updateing is the problem..
we cant allow any type of modification.... and we can achive using immutable concepts...

after making class immutable... still we can update object value... how?
e1.getPhoneNum().add("111111") // like this we can update.. 

always remember to return clone object in getter methods...
 in primitive type it automatically pass by value.. so we can modify it.. 
but in case of object.. it happen thats why return clone object.