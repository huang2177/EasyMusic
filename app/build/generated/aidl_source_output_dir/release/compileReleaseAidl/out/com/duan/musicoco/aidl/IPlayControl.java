/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: D:\\AndroidProjects\\EasyMusic\\app\\src\\main\\aidl\\com\\duan\\musicoco\\aidl\\IPlayControl.aidl
 */
package com.duan.musicoco.aidl;
// Declare any non-default types here with import statements

public interface IPlayControl extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.duan.musicoco.aidl.IPlayControl
{
private static final java.lang.String DESCRIPTOR = "com.duan.musicoco.aidl.IPlayControl";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.duan.musicoco.aidl.IPlayControl interface,
 * generating a proxy if needed.
 */
public static com.duan.musicoco.aidl.IPlayControl asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.duan.musicoco.aidl.IPlayControl))) {
return ((com.duan.musicoco.aidl.IPlayControl)iin);
}
return new com.duan.musicoco.aidl.IPlayControl.Stub.Proxy(obj);
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
case TRANSACTION_play:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.Song _arg0;
if ((0!=data.readInt())) {
_arg0 = com.duan.musicoco.aidl.Song.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.play(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_playByIndex:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _result = this.playByIndex(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getAudioSessionId:
{
data.enforceInterface(descriptor);
int _result = this.getAudioSessionId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setCurrentSong:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.Song _arg0;
if ((0!=data.readInt())) {
_arg0 = com.duan.musicoco.aidl.Song.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
int _result = this.setCurrentSong(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_pre:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.Song _result = this.pre();
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
case TRANSACTION_next:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.Song _result = this.next();
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
case TRANSACTION_pause:
{
data.enforceInterface(descriptor);
int _result = this.pause();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_resume:
{
data.enforceInterface(descriptor);
int _result = this.resume();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_currentSong:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.Song _result = this.currentSong();
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
case TRANSACTION_currentSongIndex:
{
data.enforceInterface(descriptor);
int _result = this.currentSongIndex();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_status:
{
data.enforceInterface(descriptor);
int _result = this.status();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setPlayList:
{
data.enforceInterface(descriptor);
java.util.List<com.duan.musicoco.aidl.Song> _arg0;
_arg0 = data.createTypedArrayList(com.duan.musicoco.aidl.Song.CREATOR);
int _arg1;
_arg1 = data.readInt();
int _arg2;
_arg2 = data.readInt();
com.duan.musicoco.aidl.Song _result = this.setPlayList(_arg0, _arg1, _arg2);
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
case TRANSACTION_setPlaySheet:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _arg1;
_arg1 = data.readInt();
com.duan.musicoco.aidl.Song _result = this.setPlaySheet(_arg0, _arg1);
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
case TRANSACTION_getPlayList:
{
data.enforceInterface(descriptor);
java.util.List<com.duan.musicoco.aidl.Song> _result = this.getPlayList();
reply.writeNoException();
reply.writeTypedList(_result);
return true;
}
case TRANSACTION_getPlayListId:
{
data.enforceInterface(descriptor);
int _result = this.getPlayListId();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_registerOnSongChangedListener:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.IOnSongChangedListener _arg0;
_arg0 = com.duan.musicoco.aidl.IOnSongChangedListener.Stub.asInterface(data.readStrongBinder());
this.registerOnSongChangedListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerOnPlayStatusChangedListener:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.IOnPlayStatusChangedListener _arg0;
_arg0 = com.duan.musicoco.aidl.IOnPlayStatusChangedListener.Stub.asInterface(data.readStrongBinder());
this.registerOnPlayStatusChangedListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerOnPlayListChangedListener:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.IOnPlayListChangedListener _arg0;
_arg0 = com.duan.musicoco.aidl.IOnPlayListChangedListener.Stub.asInterface(data.readStrongBinder());
this.registerOnPlayListChangedListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_registerOnDataIsReadyListener:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.IOnDataIsReadyListener _arg0;
_arg0 = com.duan.musicoco.aidl.IOnDataIsReadyListener.Stub.asInterface(data.readStrongBinder());
this.registerOnDataIsReadyListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterOnSongChangedListener:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.IOnSongChangedListener _arg0;
_arg0 = com.duan.musicoco.aidl.IOnSongChangedListener.Stub.asInterface(data.readStrongBinder());
this.unregisterOnSongChangedListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterOnPlayStatusChangedListener:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.IOnPlayStatusChangedListener _arg0;
_arg0 = com.duan.musicoco.aidl.IOnPlayStatusChangedListener.Stub.asInterface(data.readStrongBinder());
this.unregisterOnPlayStatusChangedListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterOnPlayListChangedListener:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.IOnPlayListChangedListener _arg0;
_arg0 = com.duan.musicoco.aidl.IOnPlayListChangedListener.Stub.asInterface(data.readStrongBinder());
this.unregisterOnPlayListChangedListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_unregisterOnDataIsReadyListener:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.IOnDataIsReadyListener _arg0;
_arg0 = com.duan.musicoco.aidl.IOnDataIsReadyListener.Stub.asInterface(data.readStrongBinder());
this.unregisterOnDataIsReadyListener(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_setPlayMode:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
this.setPlayMode(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getProgress:
{
data.enforceInterface(descriptor);
int _result = this.getProgress();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_seekTo:
{
data.enforceInterface(descriptor);
int _arg0;
_arg0 = data.readInt();
int _result = this.seekTo(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_remove:
{
data.enforceInterface(descriptor);
com.duan.musicoco.aidl.Song _arg0;
if ((0!=data.readInt())) {
_arg0 = com.duan.musicoco.aidl.Song.CREATOR.createFromParcel(data);
}
else {
_arg0 = null;
}
this.remove(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getPlayMode:
{
data.enforceInterface(descriptor);
int _result = this.getPlayMode();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
default:
{
return super.onTransact(code, data, reply, flags);
}
}
}
private static class Proxy implements com.duan.musicoco.aidl.IPlayControl
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
@Override public int play(com.duan.musicoco.aidl.Song which) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((which!=null)) {
_data.writeInt(1);
which.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_play, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int playByIndex(int index) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(index);
mRemote.transact(Stub.TRANSACTION_playByIndex, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getAudioSessionId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getAudioSessionId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int setCurrentSong(com.duan.musicoco.aidl.Song song) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((song!=null)) {
_data.writeInt(1);
song.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_setCurrentSong, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//上一首

@Override public com.duan.musicoco.aidl.Song pre() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.duan.musicoco.aidl.Song _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pre, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.duan.musicoco.aidl.Song.CREATOR.createFromParcel(_reply);
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
//下一首

@Override public com.duan.musicoco.aidl.Song next() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.duan.musicoco.aidl.Song _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_next, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.duan.musicoco.aidl.Song.CREATOR.createFromParcel(_reply);
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
@Override public int pause() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_pause, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int resume() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_resume, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//当前播放歌曲

@Override public com.duan.musicoco.aidl.Song currentSong() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.duan.musicoco.aidl.Song _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_currentSong, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.duan.musicoco.aidl.Song.CREATOR.createFromParcel(_reply);
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
@Override public int currentSongIndex() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_currentSongIndex, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int status() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_status, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//设置播放列表，返回下一首播放歌曲
// 为该播放列表设置一个 id ，用于区分不同歌单

@Override public com.duan.musicoco.aidl.Song setPlayList(java.util.List<com.duan.musicoco.aidl.Song> songs, int current, int id) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.duan.musicoco.aidl.Song _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeTypedList(songs);
_data.writeInt(current);
_data.writeInt(id);
mRemote.transact(Stub.TRANSACTION_setPlayList, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.duan.musicoco.aidl.Song.CREATOR.createFromParcel(_reply);
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
@Override public com.duan.musicoco.aidl.Song setPlaySheet(int sheetID, int current) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
com.duan.musicoco.aidl.Song _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(sheetID);
_data.writeInt(current);
mRemote.transact(Stub.TRANSACTION_setPlaySheet, _data, _reply, 0);
_reply.readException();
if ((0!=_reply.readInt())) {
_result = com.duan.musicoco.aidl.Song.CREATOR.createFromParcel(_reply);
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
//获得播放列表

@Override public java.util.List<com.duan.musicoco.aidl.Song> getPlayList() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
java.util.List<com.duan.musicoco.aidl.Song> _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPlayList, _data, _reply, 0);
_reply.readException();
_result = _reply.createTypedArrayList(com.duan.musicoco.aidl.Song.CREATOR);
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getPlayListId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPlayListId, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//注册播放曲目改变时回调

@Override public void registerOnSongChangedListener(com.duan.musicoco.aidl.IOnSongChangedListener li) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((li!=null))?(li.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerOnSongChangedListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerOnPlayStatusChangedListener(com.duan.musicoco.aidl.IOnPlayStatusChangedListener li) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((li!=null))?(li.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerOnPlayStatusChangedListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerOnPlayListChangedListener(com.duan.musicoco.aidl.IOnPlayListChangedListener li) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((li!=null))?(li.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerOnPlayListChangedListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void registerOnDataIsReadyListener(com.duan.musicoco.aidl.IOnDataIsReadyListener li) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((li!=null))?(li.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerOnDataIsReadyListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//取消注册播放曲目改变时回调

@Override public void unregisterOnSongChangedListener(com.duan.musicoco.aidl.IOnSongChangedListener li) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((li!=null))?(li.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterOnSongChangedListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterOnPlayStatusChangedListener(com.duan.musicoco.aidl.IOnPlayStatusChangedListener li) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((li!=null))?(li.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterOnPlayStatusChangedListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterOnPlayListChangedListener(com.duan.musicoco.aidl.IOnPlayListChangedListener li) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((li!=null))?(li.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterOnPlayListChangedListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void unregisterOnDataIsReadyListener(com.duan.musicoco.aidl.IOnDataIsReadyListener li) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((li!=null))?(li.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_unregisterOnDataIsReadyListener, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
//设置播放模式 0 列表播放（默认，播放到列表最后时停止播放），1 单曲循环，2列表循环，3 随机播放

@Override public void setPlayMode(int mode) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(mode);
mRemote.transact(Stub.TRANSACTION_setPlayMode, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getProgress() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getProgress, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int seekTo(int pos) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(pos);
mRemote.transact(Stub.TRANSACTION_seekTo, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
//移除播放列表中的歌曲（如果播放列表中有该歌曲的话）

@Override public void remove(com.duan.musicoco.aidl.Song song) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
if ((song!=null)) {
_data.writeInt(1);
song.writeToParcel(_data, 0);
}
else {
_data.writeInt(0);
}
mRemote.transact(Stub.TRANSACTION_remove, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public int getPlayMode() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getPlayMode, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_play = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_playByIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_getAudioSessionId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_setCurrentSong = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_pre = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_next = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_pause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_resume = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_currentSong = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_currentSongIndex = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_status = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_setPlayList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_setPlaySheet = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_getPlayList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getPlayListId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_registerOnSongChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_registerOnPlayStatusChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
static final int TRANSACTION_registerOnPlayListChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
static final int TRANSACTION_registerOnDataIsReadyListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
static final int TRANSACTION_unregisterOnSongChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
static final int TRANSACTION_unregisterOnPlayStatusChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
static final int TRANSACTION_unregisterOnPlayListChangedListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
static final int TRANSACTION_unregisterOnDataIsReadyListener = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
static final int TRANSACTION_setPlayMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
static final int TRANSACTION_getProgress = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
static final int TRANSACTION_seekTo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
static final int TRANSACTION_remove = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
static final int TRANSACTION_getPlayMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
}
public int play(com.duan.musicoco.aidl.Song which) throws android.os.RemoteException;
public int playByIndex(int index) throws android.os.RemoteException;
public int getAudioSessionId() throws android.os.RemoteException;
public int setCurrentSong(com.duan.musicoco.aidl.Song song) throws android.os.RemoteException;
//上一首

public com.duan.musicoco.aidl.Song pre() throws android.os.RemoteException;
//下一首

public com.duan.musicoco.aidl.Song next() throws android.os.RemoteException;
public int pause() throws android.os.RemoteException;
public int resume() throws android.os.RemoteException;
//当前播放歌曲

public com.duan.musicoco.aidl.Song currentSong() throws android.os.RemoteException;
public int currentSongIndex() throws android.os.RemoteException;
public int status() throws android.os.RemoteException;
//设置播放列表，返回下一首播放歌曲
// 为该播放列表设置一个 id ，用于区分不同歌单

public com.duan.musicoco.aidl.Song setPlayList(java.util.List<com.duan.musicoco.aidl.Song> songs, int current, int id) throws android.os.RemoteException;
public com.duan.musicoco.aidl.Song setPlaySheet(int sheetID, int current) throws android.os.RemoteException;
//获得播放列表

public java.util.List<com.duan.musicoco.aidl.Song> getPlayList() throws android.os.RemoteException;
public int getPlayListId() throws android.os.RemoteException;
//注册播放曲目改变时回调

public void registerOnSongChangedListener(com.duan.musicoco.aidl.IOnSongChangedListener li) throws android.os.RemoteException;
public void registerOnPlayStatusChangedListener(com.duan.musicoco.aidl.IOnPlayStatusChangedListener li) throws android.os.RemoteException;
public void registerOnPlayListChangedListener(com.duan.musicoco.aidl.IOnPlayListChangedListener li) throws android.os.RemoteException;
public void registerOnDataIsReadyListener(com.duan.musicoco.aidl.IOnDataIsReadyListener li) throws android.os.RemoteException;
//取消注册播放曲目改变时回调

public void unregisterOnSongChangedListener(com.duan.musicoco.aidl.IOnSongChangedListener li) throws android.os.RemoteException;
public void unregisterOnPlayStatusChangedListener(com.duan.musicoco.aidl.IOnPlayStatusChangedListener li) throws android.os.RemoteException;
public void unregisterOnPlayListChangedListener(com.duan.musicoco.aidl.IOnPlayListChangedListener li) throws android.os.RemoteException;
public void unregisterOnDataIsReadyListener(com.duan.musicoco.aidl.IOnDataIsReadyListener li) throws android.os.RemoteException;
//设置播放模式 0 列表播放（默认，播放到列表最后时停止播放），1 单曲循环，2列表循环，3 随机播放

public void setPlayMode(int mode) throws android.os.RemoteException;
public int getProgress() throws android.os.RemoteException;
public int seekTo(int pos) throws android.os.RemoteException;
//移除播放列表中的歌曲（如果播放列表中有该歌曲的话）

public void remove(com.duan.musicoco.aidl.Song song) throws android.os.RemoteException;
public int getPlayMode() throws android.os.RemoteException;
}
