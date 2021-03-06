/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\android\\new-workspace\\AidlReflection\\AIDL-Reflection\\AidlReflection\\src\\com\\example\\aidlreflectionservice\\IAIDLServerService.aidl
 */
package com.example.aidlreflectionservice;
public interface IAIDLServerService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.example.aidlreflectionservice.IAIDLServerService
{
private static final java.lang.String DESCRIPTOR = "com.example.aidlreflectionservice.IAIDLServerService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.example.aidlreflectionservice.IAIDLServerService interface,
 * generating a proxy if needed.
 */
public static com.example.aidlreflectionservice.IAIDLServerService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.example.aidlreflectionservice.IAIDLServerService))) {
return ((com.example.aidlreflectionservice.IAIDLServerService)iin);
}
return new com.example.aidlreflectionservice.IAIDLServerService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_sayHello:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _result = this.sayHello();
reply.writeNoException();
reply.writeString(_result);
return true;
}
case TRANSACTION_getBook:
{
data.enforceInterface(DESCRIPTOR);
Book _result = this.getBook();
reply.writeNoException();
if ((_result!=null)) {
reply.writeInt(1);
_result.writeToParcel(reply, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
}
else {
reply.writeInt(0);
}
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.example.aidlreflectionservice.IAIDLServerService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
@Override public java.lang.String sayHello() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.lang.String _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_sayHello, _data, _reply, 0);
_reply.readException();
_result = _reply.readString();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public Book getBook() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
Book _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getBook, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = Book.CREATOR.createFromParcel(_reply);
}
else {
_result = null;
}
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_sayHello = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_getBook = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
public java.lang.String sayHello() throws android.os.RemoteException;
public Book getBook() throws android.os.RemoteException;
}
