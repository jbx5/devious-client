import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.LinkedList;
import java.util.Random;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.Reflection;
import org.bouncycastle.crypto.tls.Certificate;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import org.bouncycastle.crypto.tls.TlsCredentials;

@ObfuscatedName("an")
class class11 implements TlsAuthentication {
	// $FF: synthetic field
	@ObfuscatedSignature(
		descriptor = "Lax;"
	)
	final class13 this$2;

	@ObfuscatedSignature(
		descriptor = "(Lax;)V"
	)
	class11(class13 var1) {
		this.this$2 = var1;
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	public void notifyServerCertificate(Certificate var1) throws IOException {
		try {
			CertificateFactory var2 = CertificateFactory.getInstance("X.509");
			LinkedList var3 = new LinkedList();
			org.bouncycastle.asn1.x509.Certificate[] var4 = var1.getCertificateList();

			for (int var5 = 0; var5 < var4.length; ++var5) {
				org.bouncycastle.asn1.x509.Certificate var6 = var4[var5];
				var3.add(var2.generateCertificate(new ByteArrayInputStream(var6.getEncoded())));
			}

			this.this$2.this$1.field48 = (java.security.cert.Certificate[])((java.security.cert.Certificate[])var3.toArray(new java.security.cert.Certificate[0]));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	@ObfuscatedName("ap")
	@ObfuscatedSignature(
		descriptor = "(JLjava/lang/String;I)I",
		garbageValue = "2023573459"
	)
	static final int method101(long var0, String var2) {
		Random var3 = new Random();
		Buffer var4 = new Buffer(128);
		Buffer var5 = new Buffer(128);
		int[] var6 = new int[]{var3.nextInt(), var3.nextInt(), (int)(var0 >> 32), (int)var0};
		var4.writeByte(10);

		int var7;
		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.writeInt(var6[0]);
		var4.writeInt(var6[1]);
		var4.writeLong(var0);
		var4.writeLong(0L);

		for (var7 = 0; var7 < 4; ++var7) {
			var4.writeInt(var3.nextInt());
		}

		var4.encryptRsa(class72.field879, class72.field880);
		var5.writeByte(10);

		for (var7 = 0; var7 < 3; ++var7) {
			var5.writeInt(var3.nextInt());
		}

		var5.writeLong(var3.nextLong());
		var5.writeLongMedium(var3.nextLong());
		SecureRandomSSLSocket.method170(var5);
		var5.writeLong(var3.nextLong());
		var5.encryptRsa(class72.field879, class72.field880);
		var7 = CollisionMap.stringCp1252NullTerminatedByteSize(var2);
		if (var7 % 8 != 0) {
			var7 += 8 - var7 % 8;
		}

		Buffer var8 = new Buffer(var7);
		var8.writeStringCp1252NullTerminated(var2);
		var8.offset = var7;
		var8.xteaEncryptAll(var6);
		Buffer var9 = new Buffer(var5.offset + var4.offset + var8.offset + 5);
		var9.writeByte(2);
		var9.writeByte(var4.offset);
		var9.writeBytes(var4.array, 0, var4.offset);
		var9.writeByte(var5.offset);
		var9.writeBytes(var5.array, 0, var5.offset);
		var9.writeShort(var8.offset);
		var9.writeBytes(var8.array, 0, var8.offset);
		byte[] var11 = var9.array;
		String var10 = ItemComposition.base64Encode(var11, 0, var11.length);
		String var12 = var10;

		try {
			URL var13 = new URL(MouseRecorder.method2371("services", false) + "m=accountappeal/login.ws");
			URLConnection var14 = var13.openConnection();
			var14.setDoInput(true);
			var14.setDoOutput(true);
			var14.setConnectTimeout(5000);
			OutputStreamWriter var15 = new OutputStreamWriter(var14.getOutputStream());
			int var18 = var12.length();
			StringBuilder var19 = new StringBuilder(var18);

			int var20;
			for (var20 = 0; var20 < var18; ++var20) {
				char var21 = var12.charAt(var20);
				if ((var21 < 'a' || var21 > 'z') && (var21 < 'A' || var21 > 'Z') && (var21 < '0' || var21 > '9') && var21 != '.' && var21 != '-' && var21 != '*' && var21 != '_') {
					if (var21 == ' ') {
						var19.append('+');
					} else {
						byte var22 = class147.charToByteCp1252(var21);
						var19.append('%');
						int var23 = var22 >> 4 & 15;
						if (var23 >= 10) {
							var19.append((char)(var23 + 55));
						} else {
							var19.append((char)(var23 + 48));
						}

						var23 = var22 & 15;
						if (var23 >= 10) {
							var19.append((char)(var23 + 55));
						} else {
							var19.append((char)(var23 + 48));
						}
					}
				} else {
					var19.append(var21);
				}
			}

			String var17 = var19.toString();
			String var26 = "data2=" + var17 + "&dest=";
			var20 = "passwordchoice.ws".length();
			StringBuilder var27 = new StringBuilder(var20);

			for (int var32 = 0; var32 < var20; ++var32) {
				char var33 = "passwordchoice.ws".charAt(var32);
				if ((var33 < 'a' || var33 > 'z') && (var33 < 'A' || var33 > 'Z') && (var33 < '0' || var33 > '9') && var33 != '.' && var33 != '-' && var33 != '*' && var33 != '_') {
					if (var33 == ' ') {
						var27.append('+');
					} else {
						byte var24 = class147.charToByteCp1252(var33);
						var27.append('%');
						int var25 = var24 >> 4 & 15;
						if (var25 >= 10) {
							var27.append((char)(var25 + 55));
						} else {
							var27.append((char)(var25 + 48));
						}

						var25 = var24 & 15;
						if (var25 >= 10) {
							var27.append((char)(var25 + 55));
						} else {
							var27.append((char)(var25 + 48));
						}
					}
				} else {
					var27.append(var33);
				}
			}

			String var30 = var27.toString();
			var15.write(var26 + var30);
			var15.flush();
			InputStream var28 = var14.getInputStream();
			var9 = new Buffer(new byte[1000]);

			do {
				int var31 = var28.read(var9.array, var9.offset, 1000 - var9.offset);
				if (var31 == -1) {
					var15.close();
					var28.close();
					String var34 = new String(var9.array);
					if (var34.startsWith("OFFLINE")) {
						return 4;
					} else if (var34.startsWith("WRONG")) {
						return 7;
					} else if (var34.startsWith("RELOAD")) {
						return 3;
					} else if (var34.startsWith("Not permitted for social network accounts.")) {
						return 6;
					} else {
						var9.xteaDecryptAll(var6);

						while (var9.offset > 0 && var9.array[var9.offset - 1] == 0) {
							--var9.offset;
						}

						var34 = new String(var9.array, 0, var9.offset);
						if (GraphicsObject.method2140(var34)) {
							class217.openURL(var34, true, false);
							return 2;
						} else {
							return 5;
						}
					}
				}

				var9.offset += var31;
			} while(var9.offset < 1000);

			return 5;
		} catch (Throwable var29) {
			var29.printStackTrace();
			return 5;
		}
	}

	@ObfuscatedName("aj")
	@ObfuscatedSignature(
		descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;",
		garbageValue = "265344198"
	)
	@Export("loadClassFromDescriptor")
	static Class loadClassFromDescriptor(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Reflection.findClass(var0);
		}
	}
}
