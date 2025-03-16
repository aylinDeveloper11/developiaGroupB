package HashSet;

import java.util.Objects;

public class Animal {
	   String name;
	   String food;  
	    
		public Animal(String name, String food) {
			this.name = name;
			this.food = food;
		}

		@Override
		public int hashCode() {
			return Objects.hash(food, name);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Animal other = (Animal) obj;
			return Objects.equals(food, other.food) && Objects.equals(name, other.name);
		}

		@Override
		public String toString() {
			return "Animal [name=" + name + ", food=" + food + "]";
		}
	    
	    
	    
}
