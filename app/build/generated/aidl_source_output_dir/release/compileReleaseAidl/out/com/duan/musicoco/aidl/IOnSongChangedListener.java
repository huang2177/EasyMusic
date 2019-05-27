/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AndroidProjects\\EasyMusic\\app\\src\\main\\aidl\\com\\duan\\musicoco\\aidl\\IOnSongChangedListener.aidl
 */
package com.duan.musicoco.aidl;
// Declare any non-default types here with import statements

public interface IOnSongChangedListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.duan.musicoco.aidl.IOnSongChangedListener
{
private static final java.lang.String DESCRIPTOR = "com.duan.musicoco.aidl.IOnSongChangedListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.duan.musicoco.aidl.IOnSongChangedListener interface,
 * generating a proxy if needed.
 */
public static com.duan.musicoco.aidl.IOnSongChangedListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.duan.musicoco.aidl.IOnSongChangedListener))) {
return ((com.duan.musicoco.aidl.IOnSongChangedListener)iin);
}
return new com.duan.musicoco.aidl.IOnSongChangedListener.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
java.lang.String descriptor = DESCRIPTOR;
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(descriptor);
return true;
}
case TRANSACTION_onSongChange:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.Song _arg0;
if ((0!=data.readInt())) {
_arg0 = com.duan.musicoco.aidl.Song.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _arg1;
_arg1 = data.readInt();
boolean _arg2;
_arg2 = (0!=data.readInt());
this.onSongChange(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements com.duan.musicoco.aidl.IOnSongChangedListener
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
//该方法运行在线程池中（非 UI 线程）

@Override public void onSongChange(com.duan.musicoco.aidl.Song which, int index, boolean isNext) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((which!=null)) {
_data.writeInt(1);
which.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
_data.writeInt(index);
_data.writeInt(((isNext)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onSongChange, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_onSongChange = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
//该方法运行在线程池中（非 UI 线程）

public void onSongChange(com.duan.musicoco.aidl.Song which, int index, boolean isNext) throws android.os.RemoteException;
}
