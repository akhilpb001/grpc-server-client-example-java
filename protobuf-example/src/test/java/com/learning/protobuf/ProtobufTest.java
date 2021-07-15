package com.learning.protobuf;

import org.junit.Test;

import java.util.Random;

import static junit.framework.TestCase.assertEquals;

public class ProtobufTest {

  @Test
  public void testAddressBookProtos() {
    String email = "johndoe@email.com";
    int id = new Random().nextInt();
    String name = "John Doe";
    String number = "01234567890";

    AddressBookProtos.Person person = AddressBookProtos.Person.newBuilder()
        .setId(id)
        .setName(name)
        .setEmail(email)
        .addNumbers(number)
        .build();

    assertEquals(person.getEmail(), email);
    assertEquals(person.getId(), id);
    assertEquals(person.getName(), name);
    assertEquals(person.getNumbers(0), number);
  }
}
