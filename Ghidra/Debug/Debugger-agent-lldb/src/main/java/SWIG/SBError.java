/* ###
 * IP: Apache License 2.0 with LLVM Exceptions
 */
package SWIG;


/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class SBError {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SBError(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SBError obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        lldbJNI.delete_SBError(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SBError() {
    this(lldbJNI.new_SBError__SWIG_0(), true);
  }

  public SBError(SBError rhs) {
    this(lldbJNI.new_SBError__SWIG_1(SBError.getCPtr(rhs), rhs), true);
  }

  public String GetCString() {
    return lldbJNI.SBError_GetCString(swigCPtr, this);
  }

  public void Clear() {
    lldbJNI.SBError_Clear(swigCPtr, this);
  }

  public boolean Fail() {
    return lldbJNI.SBError_Fail(swigCPtr, this);
  }

  public boolean Success() {
    return lldbJNI.SBError_Success(swigCPtr, this);
  }

  public long GetError() {
    return lldbJNI.SBError_GetError(swigCPtr, this);
  }

  public ErrorType GetType() {
    return ErrorType.swigToEnum(lldbJNI.SBError_GetType(swigCPtr, this));
  }

  public void SetError(long err, ErrorType type) {
    lldbJNI.SBError_SetError(swigCPtr, this, err, type.swigValue());
  }

  public void SetErrorToErrno() {
    lldbJNI.SBError_SetErrorToErrno(swigCPtr, this);
  }

  public void SetErrorToGenericError() {
    lldbJNI.SBError_SetErrorToGenericError(swigCPtr, this);
  }

  public void SetErrorString(String err_str) {
    lldbJNI.SBError_SetErrorString(swigCPtr, this, err_str);
  }

  public int SetErrorStringWithFormat(String format, String str1, String str2, String str3) {
    return lldbJNI.SBError_SetErrorStringWithFormat__SWIG_0(swigCPtr, this, format, str1, str2, str3);
  }

  public int SetErrorStringWithFormat(String format, String str1, String str2) {
    return lldbJNI.SBError_SetErrorStringWithFormat__SWIG_1(swigCPtr, this, format, str1, str2);
  }

  public int SetErrorStringWithFormat(String format, String str1) {
    return lldbJNI.SBError_SetErrorStringWithFormat__SWIG_2(swigCPtr, this, format, str1);
  }

  public int SetErrorStringWithFormat(String format) {
    return lldbJNI.SBError_SetErrorStringWithFormat__SWIG_3(swigCPtr, this, format);
  }

  public boolean IsValid() {
    return lldbJNI.SBError_IsValid(swigCPtr, this);
  }

  public boolean GetDescription(SBStream description) {
    return lldbJNI.SBError_GetDescription(swigCPtr, this, SBStream.getCPtr(description), description);
  }

  public String __str__() {
    return lldbJNI.SBError___str__(swigCPtr, this);
  }

}
