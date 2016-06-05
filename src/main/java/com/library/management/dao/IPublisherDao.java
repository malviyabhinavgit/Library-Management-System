package com.library.management.dao;

import java.util.List;

import com.library.management.modal.Publisher;

public interface IPublisherDao {
    List<Publisher> getPublishersByName(String publisherName);
    List<Publisher> getPublishers();
    Publisher addPublisher(Publisher publisher);
    boolean removePublisher(Publisher publisher);
    
}
