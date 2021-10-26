package com.teladoc.pages;

import com.teladoc.utilities.ConfigurationReader;

import javax.security.auth.login.Configuration;

public abstract class BaseClass {

public EnginCandidate enginCandidate = new EnginCandidate();
public  String url = ConfigurationReader.getProperty("way2");

}
