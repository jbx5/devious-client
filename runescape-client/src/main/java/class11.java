import java.util.LinkedList;
import net.runelite.mapping.ObfuscatedName;
import org.bouncycastle.crypto.tls.TlsCredentials;
import java.io.IOException;
import java.security.cert.CertificateFactory;
import java.security.cert.CertificateException;
import org.bouncycastle.crypto.tls.Certificate;
import net.runelite.mapping.ObfuscatedSignature;
import org.bouncycastle.crypto.tls.CertificateRequest;
import org.bouncycastle.crypto.tls.TlsAuthentication;
import java.io.ByteArrayInputStream;
import java.awt.FontMetrics;
import net.runelite.mapping.Export;
@ObfuscatedName("t")
class class11 implements TlsAuthentication {
	@ObfuscatedName("s")
	@Export("musicTrackBoolean")
	public static boolean musicTrackBoolean;

	@ObfuscatedName("ab")
	@Export("loginScreenFontMetrics")
	static FontMetrics loginScreenFontMetrics;

	@ObfuscatedSignature(descriptor = "Lr;")
	final class13 this$2;

	@ObfuscatedSignature(descriptor = "(Lr;)V")
	class11(class13 var1) {
		this.this$2 = var1;
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
			this.this$2.this$1.field63 = ((java.security.cert.Certificate[]) ((java.security.cert.Certificate[]) (var3.toArray(new java.security.cert.Certificate[0]))));
		} catch (CertificateException var7) {
			throw new IOException(var7);
		}
	}

	public TlsCredentials getClientCredentials(CertificateRequest var1) throws IOException {
		return null;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = "(IIIII)V", garbageValue = "1603427189")
	static final void method98(int var0, int var1, int var2, int var3) {
		for (int var4 = var1; var4 <= var3 + var1; ++var4) {
			for (int var5 = var0; var5 <= var0 + var2; ++var5) {
				if (var5 >= 0 && var5 < 104 && var4 >= 0 && var4 < 104) {
					UserComparator6.field1415[0][var5][var4] = 127;
					if (var0 == var5 && var5 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 - 1][var4];
					}
					if (var0 + var2 == var5 && var5 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5 + 1][var4];
					}
					if (var4 == var1 && var4 > 0) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 - 1];
					}
					if (var3 + var1 == var4 && var4 < 103) {
						Tiles.Tiles_heights[0][var5][var4] = Tiles.Tiles_heights[0][var5][var4 + 1];
					}
				}
			}
		}
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(descriptor = "(ILkb;IIIII[FI)Lkb;", garbageValue = "1978245093")
	static Widget method97(int var0, Widget var1, int var2, int var3, int var4, int var5, int var6, float[] var7) {
		Widget var8 = new Widget();
		var8.type = var0;
		var8.parentId = var1.id;
		var8.childIndex = var2;
		var8.isIf3 = true;
		var8.xAlignment = var3;
		var8.yAlignment = var4;
		var8.widthAlignment = var5;
		var8.heightAlignment = var6;
		var8.rawX = ((int) (var7[0] * ((float) (var1.width))));
		var8.rawY = ((int) (((float) (var1.height)) * var7[1]));
		var8.rawWidth = ((int) (((float) (var1.width)) * var7[2]));
		var8.rawHeight = ((int) (var7[3] * ((float) (var1.height))));
		return var8;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(descriptor = "(ILbi;ZB)I", garbageValue = "-27")
	static int method96(int var0, Script var1, boolean var2) {
		if (var0 == 7100) {
			++class446.Interpreter_intStackSize;
			return 1;
		} else if (var0 == 7101) {
			Interpreter.Interpreter_stringStackSize += 2;
			return 1;
		} else if (var0 != 7102 && var0 != 7103 && var0 != 7104 && var0 != 7105 && var0 != 7109) {
			if (var0 == 7106) {
				++class446.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7107) {
				++class446.Interpreter_intStackSize;
				return 1;
			} else if (var0 == 7108) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = (class18.method234()) ? 1 : 0;
				return 1;
			} else if (var0 == 7110) {
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7120) {
				--class446.Interpreter_intStackSize;
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else if (var0 == 7121) {
				class446.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = -1;
				return 1;
			} else if (var0 == 7122) {
				class446.Interpreter_intStackSize -= 2;
				Interpreter.Interpreter_intStack[++class446.Interpreter_intStackSize - 1] = 0;
				return 1;
			} else {
				return 2;
			}
		} else {
			++class446.Interpreter_intStackSize;
			return 1;
		}
	}
}