package com.priya.travelpackages.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PremiumPassenger extends Passenger{

    public PremiumPassenger(String passengerName, int passengerNumber, double balanceAmount, Map<Destination, List<Activity>> signedUpActivties) {
        super(passengerName, passengerNumber, balanceAmount, signedUpActivties);
    }

    @Override
    public void printPassengerDetails() {
        System.out.println("Passenger Name : " + this.passengerName);
        System.out.println("Passenger Number : " + this.passengerNumber);

        Map<Destination, List<Activity>> signedUpActivties = this.signedUpActivties;

        for(Destination destination : signedUpActivties.keySet()) {
            String destinationName = destination.getName();
            System.out.println("Destination Name : " + destinationName);
            List<Activity> activities = signedUpActivties.get(destination);
            for(Activity activity : activities) {
                System.out.print(activity.getName() + " ");
                System.out.println(activity.getCost());
            }
        }
    }

    @Override
    public boolean signUpForAnActivity(Destination destination, Activity activity) {

        if(validatePassengerSignUpForActivty(activity)) {
            return false;
        }
        else {
            int activityCapacity = activity.getCapacity();
            Map<Destination, List<Activity>> signedUpActivties = this.getSignedUpActivties();

            activity.setCapacity(activityCapacity - 1);

            signedUpActivties.computeIfAbsent(destination, k -> new ArrayList<>());
            signedUpActivties.get(destination).add(activity);
            this.setSignedUpActivties(signedUpActivties);

            return true;
        }
    }

    @Override
    public boolean validatePassengerSignUpForActivty(Activity activity) {
        return activity.getCapacity() == 0;
    }
}
