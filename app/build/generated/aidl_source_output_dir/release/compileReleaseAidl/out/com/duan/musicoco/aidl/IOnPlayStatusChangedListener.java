/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AndroidProjects\\EasyMusic\\app\\src\\main\\aidl\\com\\duan\\musicoco\\aidl\\IOnPlayStatusChangedListener.aidl
 */
package com.duan.musicoco.aidl;
// Declare any non-default types here with import statements

public interface IOnPlayStatusChangedListener extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.duan.musicoco.aidl.IOnPlayStatusChangedListener
{
private static final java.lang.String DESCRIPTOR = "com.duan.musicoco.aidl.IOnPlayStatusChangedListener";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.duan.musicoco.aidl.IOnPlayStatusChangedListener interface,
 * generating a proxy if needed.
 */
public static com.duan.musicoco.aidl.IOnPlayStatusChangedListener asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.duan.musicoco.aidl.IOnPlayStatusChangedListener))) {
return ((com.duan.musicoco.aidl.IOnPlayStatusChangedListener)iin);
}
return new com.duan.musicoco.aidl.IOnPlayStatusChangedListener.Stub.Proxy(obj);
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
case TRANSACTION_playStop:
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
int _arg2;
_arg2 = data.readInt();
this.playStop(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
case TRANSACTION_playStart:
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
int _arg2;
_arg2 = data.readInt();
this.playStart(_arg0, _arg1, _arg2);
reply.writeNoException();
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements com.duan.musicoco.aidl.IOnPlayStatusChangedListener
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
//自动播放时歌曲播放完成时回调

@Override public void playStop(com.duan.musicoco.aidl.Song which, int index, int status) throws android.os.RemoteException
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
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_playStop, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//自动播放时歌曲开始播放时回调

@Override public void playStart(com.duan.musicoco.aidl.Song which, int index, int status) throws android.os.RemoteException
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
_data.writeInt(status);
mRemote.transact(Stub.TRANSACTION_playStart, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
}
static final int TRANSACTION_playStop = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_playStart = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
}
//自动播放时歌曲播放完成时回调

public void playStop(com.duan.musicoco.aidl.Song which, int index, int status) throws android.os.RemoteException;
//自动播放时歌曲开始播放时回调

public void playStart(com.duan.musicoco.aidl.Song which, int index, int status) throws android.os.RemoteException;
}
