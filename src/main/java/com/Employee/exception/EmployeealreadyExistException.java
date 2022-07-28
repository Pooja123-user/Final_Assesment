package com.Employee.exception;

@SuppressWarnings("serial")
public class EmployeealreadyExistException  extends RuntimeException {
	 
private String message;

public EmployeealreadyExistException() {}

public EmployeealreadyExistException(String msg)
{
    super(msg);
    this.message = msg;
}
}