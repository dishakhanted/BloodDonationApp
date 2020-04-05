package com.raksha.bmsce.blooddonation.data.source;

import com.raksha.bmsce.blooddonation.data.model.ReceiverDonorRequestType;
import com.raksha.bmsce.blooddonation.data.model.User;

/**
 * Created by riteshksingh on Apr, 2018
 */
public interface DonationDataSource {
  void saveNewUser(String userId, User user);

  void saveReceiverDetails(String userId, ReceiverDonorRequestType receiverDonorRequestType);

  void saveDonorDetails(String userId, ReceiverDonorRequestType receiverDonorRequestType);
}
