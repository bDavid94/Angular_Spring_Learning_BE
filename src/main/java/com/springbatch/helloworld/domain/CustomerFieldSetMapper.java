//package com.springbatch.helloworld.domain;
//
//import org.springframework.batch.item.file.mapping.FieldSetMapper;
//import org.springframework.batch.item.file.transform.FieldSet;
//import org.springframework.validation.BindException;
//
//public class CustomerFieldSetMapper implements FieldSetMapper<Customer> {
//    @Override
//    public Customer mapFieldSet(FieldSet fieldSet) throws BindException {
//        return new Customer(fieldSet.readString("firstName"),
//                            fieldSet.readString("lastName"),
//                            fieldSet.readDate("birthDate", "yyyy-MM-dd HH:mm:ss"));
//    }
//}
