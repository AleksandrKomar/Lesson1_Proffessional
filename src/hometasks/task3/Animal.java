package hometasks.task3;

public class Animal implements Comparable <Animal> {
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    // Сортируем по скорости/цене/вес/порода
    //не вижу смысла с примера оставлять Object, раз мы работаем с Animal
    @Override
    public int compareTo(Animal o) {

        //это полседнее поле для сорировки
        int resBreed = this.breed.compareTo(o.breed);

        //по условию- если значения равны - то стравнить следующий параметр
        if (this.speed != o.speed) {
            return this.speed - o.speed;
        } else if (this.price != o.price) {
            return this.price - o.price;
        } else if (this.weight != o.weight) {
            return this.weight - o.weight;
        } else {
            return resBreed;
        }

    }

}
