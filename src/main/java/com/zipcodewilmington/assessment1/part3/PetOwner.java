package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    private String name;
    private Pet[] pets;
    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        if (pets != null) {
            for (Pet p : pets) {
                p.setOwner(this);
            }
        }
        this.pets = pets;
    }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pet.setOwner(this);
        ArrayList<Pet> petsArrayList = getPetsAsArrayList();
        petsArrayList.add(pet);
        this.pets = petsArrayList.toArray(new Pet[0]);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        pet.setOwner(null);
        ArrayList<Pet> petsArrayList = getPetsAsArrayList();
        int index = petsArrayList.indexOf(pet);
        petsArrayList.set(index, null);
        this.pets = petsArrayList.toArray(new Pet[0]);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        boolean result = false;
        for (Pet p : this.pets) {
            if (p.equals(pet)) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    @SuppressWarnings("Duplicates")
    public Integer getYoungetPetAge() {
        int youngestAge = Integer.MAX_VALUE;
        int nextAge;

        if (this.pets != null) {
            for (Pet p : this.pets) {
                nextAge = p.age;
                if (nextAge < youngestAge) {
                    youngestAge = nextAge;
                }
            }
            return youngestAge;
        } else {
            return null;
        }
    }




    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    @SuppressWarnings("Duplicates")
    public Integer getOldestPetAge() {
        int oldestAge = Integer.MIN_VALUE;
        int nextAge;

        if (this.pets != null) {
            for (Pet p : this.pets) {
                nextAge = p.age;
                if (nextAge > oldestAge) {
                    oldestAge = nextAge;
                }
            }
            return oldestAge;
        } else {
            return null;
        }
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    @SuppressWarnings("Duplicates")
    public Float getAveragePetAge() {
        float sumOfAges = 0;

        if (this.pets != null) {
            for (Pet p : this.pets) {
                sumOfAges += p.age;
            }
            return sumOfAges / this.pets.length;
        } else {
            return null;
        }
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        int numberOfPets = 0;
        if (this.pets != null){
            numberOfPets = pets.length;
        }
        return numberOfPets;
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        return this.pets;
    }

    private ArrayList<Pet> getPetsAsArrayList() {
        ArrayList<Pet> petsArrayList = new ArrayList<>();
        if (pets != null) {
            petsArrayList = new ArrayList<>(Arrays.asList(pets));
        } else {
            petsArrayList = new ArrayList<>();
        }
        return petsArrayList;
    }
}
