/*
 *

*/



public class Card {
    
    private String suit;
    private String faceValue;
    private int rank;
    private int worth;
    private int order;
    private String image;
    
    public Card(String fv, String su) {
        suit = su;
        faceValue = fv;
        this.rank = rank;
        this.worth = worth;
    }
    
    public String toString() {
        return faceValue + " of " + suit;
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @return the faceValue
     */
    public String getFaceValue() {
        return faceValue;
    }

    /**
     * @return the rank
     */
    public int getRank() {
        return rank;
    }

    /**
     * @return the worth
     */
    public int getWorth() {
        return worth;
    }

    /**
     * @param worth the worth to set
     */
    public void setWorth(int worth) {
        this.worth = worth;
    }

    /**
     * @param order the order to set
     */
    public void setOrder(int order) {
        this.order = order;
    }

    /**
     * @return the order
     */
    public int getOrder() {
        return order;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }
}
