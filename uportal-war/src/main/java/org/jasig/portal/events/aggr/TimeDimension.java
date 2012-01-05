/**
 * Licensed to Jasig under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Jasig licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a
 * copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.jasig.portal.events.aggr;

import java.util.Calendar;


/**
 * Describes a dimension in time (hours). Each object represents one minute in a 24 period
 * 
 * @author Eric Dalquist
 * @version $Revision$
 */
public interface TimeDimension {
    /**
     * @return The ID of the dimension
     */
    long getId();
    /**
     * Will only return values between 0 and 23 inclusive
     * 
     * @return The hour the minute exists in 
     * @see Calendar#MINUTE
     */
    int getHour();
    /**
     * Will only return values between 0 and 11 inclusive
     * 
     * @return The five minute block within the hour the minute exists in
     */
    int getFiveMinuteIncrement();
    /**
     * Will only return values between 0 and 59 inclusive
     * 
     * @return The minute within the hour
     * @see Calendar#HOUR_OF_DAY
     */
    int getMinute();
    
    /**
     * @return A new Calendar instance that represents the state of the time dimension. All fields except hour and minute will be unset
     */
    Calendar getCalendar();
}