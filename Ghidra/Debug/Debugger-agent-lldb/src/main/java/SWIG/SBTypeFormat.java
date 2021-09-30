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


public class SBTypeFormat {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SBTypeFormat(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SBTypeFormat obj) {
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
        lldbJNI.delete_SBTypeFormat(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SBTypeFormat() {
    this(lldbJNI.new_SBTypeFormat__SWIG_0(), true);
  }

  public SBTypeFormat(Format format, long options) {
    this(lldbJNI.new_SBTypeFormat__SWIG_1(format.swigValue(), options), true);
  }

  public SBTypeFormat(Format format) {
    this(lldbJNI.new_SBTypeFormat__SWIG_2(format.swigValue()), true);
  }

  public SBTypeFormat(String type, long options) {
    this(lldbJNI.new_SBTypeFormat__SWIG_3(type, options), true);
  }

  public SBTypeFormat(String type) {
    this(lldbJNI.new_SBTypeFormat__SWIG_4(type), true);
  }

  public SBTypeFormat(SBTypeFormat rhs) {
    this(lldbJNI.new_SBTypeFormat__SWIG_5(SBTypeFormat.getCPtr(rhs), rhs), true);
  }

  public boolean IsValid() {
    return lldbJNI.SBTypeFormat_IsValid(swigCPtr, this);
  }

  public boolean IsEqualTo(SBTypeFormat rhs) {
    return lldbJNI.SBTypeFormat_IsEqualTo(swigCPtr, this, SBTypeFormat.getCPtr(rhs), rhs);
  }

  public Format GetFormat() {
    return Format.swigToEnum(lldbJNI.SBTypeFormat_GetFormat(swigCPtr, this));
  }

  public String GetTypeName() {
    return lldbJNI.SBTypeFormat_GetTypeName(swigCPtr, this);
  }

  public long GetOptions() {
    return lldbJNI.SBTypeFormat_GetOptions(swigCPtr, this);
  }

  public void SetFormat(Format arg0) {
    lldbJNI.SBTypeFormat_SetFormat(swigCPtr, this, arg0.swigValue());
  }

  public void SetTypeName(String arg0) {
    lldbJNI.SBTypeFormat_SetTypeName(swigCPtr, this, arg0);
  }

  public void SetOptions(long arg0) {
    lldbJNI.SBTypeFormat_SetOptions(swigCPtr, this, arg0);
  }

  public boolean GetDescription(SBStream description, DescriptionLevel description_level) {
    return lldbJNI.SBTypeFormat_GetDescription(swigCPtr, this, SBStream.getCPtr(description), description, description_level.swigValue());
  }

  public String __str__() {
    return lldbJNI.SBTypeFormat___str__(swigCPtr, this);
  }

}
