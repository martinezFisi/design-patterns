/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unmsm.observer.observer;

import com.unmsm.observer.subject.NotificationInfo;
import com.unmsm.observer.subject.Subject;

/**
 *
 * @author USER
 */
public interface Observer {
    void update(Subject s, NotificationInfo ni);
}
