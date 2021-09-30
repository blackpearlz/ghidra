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


public class SBDeclaration {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected SBDeclaration(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(SBDeclaration obj) {
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
        lldbJNI.delete_SBDeclaration(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public SBDeclaration() {
    this(lldbJNI.new_SBDeclaration__SWIG_0(), true);
  }

  public SBDeclaration(SBDeclaration rhs) {
    this(lldbJNI.new_SBDeclaration__SWIG_1(SBDeclaration.getCPtr(rhs), rhs), true);
  }

  public boolean IsValid() {
    return lldbJNI.SBDeclaration_IsValid(swigCPtr, this);
  }

  public SBFileSpec GetFileSpec() {
    return new SBFileSpec(lldbJNI.SBDeclaration_GetFileSpec(swigCPtr, this), true);
  }

  public long GetLine() {
    return lldbJNI.SBDeclaration_GetLine(swigCPtr, this);
  }

  public long GetColumn() {
    return lldbJNI.SBDeclaration_GetColumn(swigCPtr, this);
  }

  public boolean GetDescription(SBStream description) {
    return lldbJNI.SBDeclaration_GetDescription(swigCPtr, this, SBStream.getCPtr(description), description);
  }

  public void SetFileSpec(SBFileSpec filespec) {
    lldbJNI.SBDeclaration_SetFileSpec(swigCPtr, this, SBFileSpec.getCPtr(filespec), filespec);
  }

  public void SetLine(long line) {
    lldbJNI.SBDeclaration_SetLine(swigCPtr, this, line);
  }

  public void SetColumn(long column) {
    lldbJNI.SBDeclaration_SetColumn(swigCPtr, this, column);
  }

  public String __str__() {
    return lldbJNI.SBDeclaration___str__(swigCPtr, this);
  }

}
