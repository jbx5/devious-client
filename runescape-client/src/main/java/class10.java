import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("r")
public class class10 {
	@ObfuscatedName("y")
	@Export("operatingSystemName")
	static String operatingSystemName;
	@ObfuscatedName("em")
	@ObfuscatedSignature(descriptor = 
	"Llx;")

	@Export("archive2")
	static Archive archive2;
	@ObfuscatedName("jz")
	@ObfuscatedGetter(intValue = 
	-1267419989)

	@Export("oculusOrbFocalPointX")
	static int oculusOrbFocalPointX;
	@ObfuscatedName("v")
	HttpsURLConnection field40;
	@ObfuscatedName("c")
	final Map field39;
	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"Lok;")

	class398 field41;
	@ObfuscatedName("f")
	Map field42;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"Lo;")

	final class9 field50;
	@ObfuscatedName("n")
	boolean field44;
	@ObfuscatedName("s")
	boolean field43;
	@ObfuscatedName("l")
	@ObfuscatedGetter(intValue = 
	1184056315)

	int field46;

	@ObfuscatedSignature(descriptor = 
	"(Ljava/net/URL;Lo;)V")

	public class10(URL var1, class9 var2) throws IOException {
		this.field44 = false;
		this.field43 = false;
		this.field46 = 300000;
		if (!var2.method63()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.method62());
		} else {
			this.field40 = ((HttpsURLConnection) (var1.openConnection()));
			this.field40.setSSLSocketFactory(new class15());
			this.field50 = var2;
			this.field39 = new HashMap();
			this.field42 = new HashMap();
		}
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Ljava/lang/String;I)V", garbageValue = 
	"-1291882131")

	public void method77(String var1, String var2) {
		if (!this.field44) {
			this.field39.put(var1, var2);
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/lang/String;", garbageValue = 
	"2109426095")

	String method78() {
		ArrayList var1 = new ArrayList(this.field42.entrySet());
		Collections.sort(var1, new class18(this));
		StringBuilder var2 = new StringBuilder();
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Entry var4 = ((Entry) (var3.next()));
			if (var2.length() > 0) {
				var2.append(",");
			}

			var2.append(((class397) (var4.getKey())).method7142());
			float var5 = ((Float) (var4.getValue()));
			if (var5 < 1.0F) {
				String var6 = Float.toString(var5).substring(0, 4);
				var2.append(";q=" + var6);
			}
		} 

		return var2.toString();
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"1987536399")

	void method79() throws ProtocolException {
		if (!this.field44) {
			this.field40.setRequestMethod(this.field50.method62());
			if (!this.field42.isEmpty()) {
				this.field39.put("Accept", this.method78());
			}

			Iterator var1 = this.field39.entrySet().iterator();

			while (var1.hasNext()) {
				Entry var2 = ((Entry) (var1.next()));
				this.field40.setRequestProperty(((String) (var2.getKey())), ((String) (var2.getValue())));
			} 

			if (this.field50.method66() && (this.field41 != null)) {
				this.field40.setDoOutput(true);
				ByteArrayOutputStream var13 = new ByteArrayOutputStream();

				try {
					var13.write(this.field41.vmethod7150());
					var13.writeTo(this.field40.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					if (var13 != null) {
						try {
							var13.close();
						} catch (IOException var10) {
							var10.printStackTrace();
						}
					}

				}
			}

			this.field40.setConnectTimeout(this.field46);
			this.field40.setInstanceFollowRedirects(this.field43);
			this.field44 = true;
		}
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(I)Z", garbageValue = 
	"216770945")

	boolean method86() throws IOException, SocketTimeoutException {
		if (!this.field44) {
			this.method79();
		}

		this.field40.connect();
		return this.field40.getResponseCode() == (-1);
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(B)Ly;", garbageValue = 
	"-63")

	class21 method81() {
		try {
			if ((!this.field44) || (this.field40.getResponseCode() == (-1))) {
				return new class21("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.field40.disconnect();
			return new class21("Error decoding REST response code: " + var10.getMessage());
		}

		class21 var1 = null;

		class21 var3;
		try {
			var1 = new class21(this.field40);
			return var1;
		} catch (IOException var8) {
			var3 = new class21("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.field40.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ldt;FI)F", garbageValue = 
	"1273799052")

	static float method92(class117 var0, float var1) {
		if ((var0 != null) && (var0.method2715() != 0)) {
			if (var1 < ((float) (var0.field1411[0].field1373))) {
				return var0.field1409 == class116.field1403 ? var0.field1411[0].field1376 : UserComparator9.method2616(var0, var1, true);
			} else if (var1 > ((float) (var0.field1411[var0.method2715() - 1].field1373))) {
				return var0.field1410 == class116.field1403 ? var0.field1411[var0.method2715() - 1].field1376 : UserComparator9.method2616(var0, var1, false);
			} else if (var0.field1408) {
				return var0.field1411[0].field1376;
			} else {
				class113 var2 = var0.method2736(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var7;
					if ((0.0 == ((double) (var2.field1369))) && (0.0 == ((double) (var2.field1374)))) {
						var3 = true;
					} else if ((Float.MAX_VALUE == var2.field1369) && (var2.field1374 == Float.MAX_VALUE)) {
						var4 = true;
					} else if (var2.field1375 != null) {
						if (var0.field1407) {
							float[] var5 = new float[4];
							float[] var6 = new float[4];
							var5[0] = ((float) (var2.field1373));
							var6[0] = var2.field1376;
							var5[1] = (0.33333334F * var2.field1369) + var5[0];
							var6[1] = var6[0] + (var2.field1374 * 0.33333334F);
							var5[3] = ((float) (var2.field1375.field1373));
							var6[3] = var2.field1375.field1376;
							var5[2] = var5[3] - (0.33333334F * var2.field1375.field1371);
							var6[2] = var6[3] - (var2.field1375.field1377 * 0.33333334F);
							if (var0.field1413) {
								if (var0 != null) {
									var7 = var5[3] - var5[0];
									if (0.0 != ((double) (var7))) {
										float var8 = var5[1] - var5[0];
										float var9 = var5[2] - var5[0];
										Float var10 = var8 / var7;
										Float var11 = var9 / var7;
										var0.field1412 = (var10 == 0.33333334F) && (var11 == 0.6666667F);
										float var12 = var10;
										float var13 = var11;
										if (((double) (var10)) < 0.0) {
											var10 = 0.0F;
										}

										if (((double) (var11)) > 1.0) {
											var11 = 1.0F;
										}

										if ((((double) (var10)) > 1.0) || (var11 < (-1.0F))) {
											class290.method5558(var10, var11);
										}

										if (var10 != var12) {
											var5[1] = var5[0] + (var10 * var7);
											if (((double) (var12)) != 0.0) {
												var6[1] = var6[0] + (((var6[1] - var6[0]) * var10) / var12);
											}
										}

										if (var11 != var13) {
											var5[2] = var5[0] + (var11 * var7);
											if (1.0 != ((double) (var13))) {
												var6[2] = ((float) (((double) (var6[3])) - ((((double) (var6[3] - var6[2])) * (1.0 - ((double) (var11)))) / (1.0 - ((double) (var13))))));
											}
										}

										var0.field1422 = var5[0];
										var0.field1414 = var5[3];
										float var14 = var10;
										float var15 = var11;
										float[] var16 = var0.field1415;
										float var17 = var14 - 0.0F;
										float var18 = var15 - var14;
										float var19 = 1.0F - var15;
										float var20 = var18 - var17;
										var16[3] = (var19 - var18) - var20;
										var16[2] = (var20 + var20) + var20;
										var16[1] = (var17 + var17) + var17;
										var16[0] = 0.0F;
										var17 = var6[0];
										var18 = var6[1];
										var19 = var6[2];
										var20 = var6[3];
										float[] var21 = var0.field1416;
										float var22 = var18 - var17;
										float var23 = var19 - var18;
										float var24 = var20 - var19;
										float var25 = var23 - var22;
										var21[3] = (var24 - var23) - var25;
										var21[2] = (var25 + var25) + var25;
										var21[1] = (var22 + var22) + var22;
										var21[0] = var17;
									}
								}
							} else {
								UserComparator8.method2574(var0, var5, var6);
							}

							var0.field1407 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1376;
					} else if (var4) {
						return (((float) (var2.field1373)) != var1) && (var2.field1375 != null) ? var2.field1375.field1376 : var2.field1376;
					} else if (var0.field1413) {
						float var30;
						if (var0 == null) {
							var30 = 0.0F;
						} else {
							float var26;
							if (var0.field1422 == var1) {
								var26 = 0.0F;
							} else if (var0.field1414 == var1) {
								var26 = 1.0F;
							} else {
								var26 = (var1 - var0.field1422) / (var0.field1414 - var0.field1422);
							}

							if (var0.field1412) {
								var7 = var26;
							} else {
								float[] var27 = new float[]{ var0.field1415[0] - var26, var0.field1415[1], var0.field1415[2], var0.field1415[3] };
								float[] var28 = new float[5];
								int var29 = class132.method2888(var27, 3, 0.0F, true, 1.0F, true, var28);
								if (var29 == 1) {
									var7 = var28[0];
								} else {
									var7 = 0.0F;
								}
							}

							var30 = var0.field1416[0] + ((var0.field1416[1] + (var7 * ((var7 * var0.field1416[3]) + var0.field1416[2]))) * var7);
						}

						return var30;
					} else {
						return class147.method3106(var0, var1);
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(descriptor = 
	"(ILbd;ZB)I", garbageValue = 
	"-3")

	static int method87(int var0, Script var1, boolean var2) {
		if (var0 == 6900) {
			Interpreter.Interpreter_stringStack[(++class122.Interpreter_stringStackSize) - 1] = "";
			return 1;
		} else if (var0 == 6950) {
			Interpreter.Interpreter_intStack[(++Interpreter.Interpreter_intStackSize) - 1] = -1;
			return 1;
		} else {
			return 2;
		}
	}
}