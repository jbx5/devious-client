import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import java.io.InvalidClassException;
import net.runelite.mapping.Implements;
import java.io.IOException;
import java.lang.reflect.Method;
import java.io.DataInputStream;
import java.net.URLConnection;
import net.runelite.rs.Reflection;
import java.io.OptionalDataException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Field;
import java.net.URL;
import net.runelite.mapping.ObfuscatedSignature;
import java.io.ByteArrayInputStream;
import net.runelite.mapping.ObfuscatedGetter;
import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import java.util.Queue;
import net.runelite.mapping.Export;
@ObfuscatedName("cu")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("i")
	@ObfuscatedGetter(intValue = 1082295421)
	@Export("musicTrackGroupId")
	public static int musicTrackGroupId;

	@ObfuscatedName("al")
	@ObfuscatedSignature(descriptor = "Lnh;")
	static Bounds field1346;

	@ObfuscatedName("s")
	final Thread field1344 = new Thread(this);

	@ObfuscatedName("h")
	@Export("isClosed")
	volatile boolean isClosed;

	@ObfuscatedName("w")
	@Export("requests")
	Queue requests = new LinkedList();

	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = -1681223407)
	int field1349;

	UrlRequester(int var1) {
		this.field1344.setPriority(1);
		this.field1344.start();
		this.field1349 = var1;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lcv;B)V", garbageValue = "38")
	abstract void vmethod2504(UrlRequest var1) throws IOException;

	@ObfuscatedName("h")
	@ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;I)V", garbageValue = "-1248048325")
	void method2483(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.field1349);
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = "(Ljava/net/URLConnection;Lcv;I)V", garbageValue = "-1807298626")
	void method2484(URLConnection var1, UrlRequest var2) {
		DataInputStream var3 = null;
		try {
			int var5 = var1.getContentLength();
			var3 = new DataInputStream(var1.getInputStream());
			byte[] var4;
			if (var5 >= 0) {
				var4 = new byte[var5];
				var3.readFully(var4);
			} else {
				var4 = new byte[0];
				byte[] var6 = ArchiveDiskActionHandler.ByteArrayPool_getArray(5000);
				byte[] var8;
				for (int var7 = var3.read(var6, 0, var6.length); var7 > -1; var4 = var8) {
					var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
				}
				WorldMapData_1.ByteArrayPool_release(var6);
			}
			var2.response0 = var4;
		} catch (IOException var10) {
		}
		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var9) {
			}
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = "(Ljava/net/URL;I)Lcv;", garbageValue = "-1152781459")
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1);
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = "(S)V", garbageValue = "11038")
	@Export("close")
	public void close() {
		this.isClosed = true;
		try {
			synchronized(this) {
				this.notify();
			}
			this.field1344.join();
		} catch (InterruptedException var4) {
		}
	}

	public void run() {
		while (!this.isClosed) {
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = ((UrlRequest) (this.requests.poll()));
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}
				this.vmethod2504(var1);
			} catch (Exception var7) {
				class33.RunException_sendStackTrace(((String) (null)), var7);
			}
		} 
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = "(Lqz;I)V", garbageValue = "-776067812")
	@Export("performReflectionCheck")
	public static void performReflectionCheck(PacketBuffer var0) {
		ReflectionCheck var1 = ((ReflectionCheck) (class33.reflectionChecks.last()));
		if (var1 != null) {
			int var2 = var0.offset;
			var0.writeInt(var1.id);
			for (int var3 = 0; var3 < var1.size; ++var3) {
				if (var1.creationErrors[var3] != 0) {
					var0.writeByte(var1.creationErrors[var3]);
				} else {
					try {
						int var4 = var1.operations[var3];
						Field var5;
						int var6;
						if (var4 == 0) {
							var5 = var1.fields[var3];
							var6 = Reflection.getInt(var5, ((Object) (null)));
							var0.writeByte(0);
							var0.writeInt(var6);
						} else if (var4 == 1) {
							var5 = var1.fields[var3];
							Reflection.setInt(var5, ((Object) (null)), var1.intReplaceValues[var3]);
							var0.writeByte(0);
						} else if (var4 == 2) {
							var5 = var1.fields[var3];
							var6 = var5.getModifiers();
							var0.writeByte(0);
							var0.writeInt(var6);
						}
						Method var25;
						if (var4 != 3) {
							if (var4 == 4) {
								var25 = var1.methods[var3];
								var6 = var25.getModifiers();
								var0.writeByte(0);
								var0.writeInt(var6);
							}
						} else {
							var25 = var1.methods[var3];
							byte[][] var10 = var1.arguments[var3];
							Object[] var7 = new Object[var10.length];
							for (int var8 = 0; var8 < var10.length; ++var8) {
								ObjectInputStream var9 = new ObjectInputStream(new ByteArrayInputStream(var10[var8]));
								var7[var8] = var9.readObject();
							}
							Object var11 = Reflection.invoke(var25, ((Object) (null)), var7);
							if (var11 == null) {
								var0.writeByte(0);
							} else if (var11 instanceof Number) {
								var0.writeByte(1);
								var0.writeLong(((Number) (var11)).longValue());
							} else if (var11 instanceof String) {
								var0.writeByte(2);
								var0.writeStringCp1252NullTerminated(((String) (var11)));
							} else {
								var0.writeByte(4);
							}
						}
					} catch (ClassNotFoundException var13) {
						var0.writeByte(-10);
					} catch (InvalidClassException var14) {
						var0.writeByte(-11);
					} catch (StreamCorruptedException var15) {
						var0.writeByte(-12);
					} catch (OptionalDataException var16) {
						var0.writeByte(-13);
					} catch (IllegalAccessException var17) {
						var0.writeByte(-14);
					} catch (IllegalArgumentException var18) {
						var0.writeByte(-15);
					} catch (InvocationTargetException var19) {
						var0.writeByte(-16);
					} catch (SecurityException var20) {
						var0.writeByte(-17);
					} catch (IOException var21) {
						var0.writeByte(-18);
					} catch (NullPointerException var22) {
						var0.writeByte(-19);
					} catch (Exception var23) {
						var0.writeByte(-20);
					} catch (Throwable var24) {
						var0.writeByte(-21);
					}
				}
			}
			var0.writeCrc(var2);
			var1.remove();
		}
	}
}