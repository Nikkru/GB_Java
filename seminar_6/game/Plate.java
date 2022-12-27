package seminar_6.game;

public class Plate {

        private int currentFood;

        public Plate(int currentFood) {
            this.currentFood = currentFood;
        }

        public boolean decreaseFood(int foodCount) {
            if (this.currentFood >= foodCount) {
                this.currentFood -= foodCount;
                return true;
            } else {
                return false;
            }
        }

}
