import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.ProtocolException;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("aq")
@Implements("HttpRequest")
public class HttpRequest {
	@ObfuscatedName("ab")
	@Export("connection")
	final HttpsURLConnection connection;
	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "Lrf;"
	)
	@Export("httpHeaders")
	final HttpHeaders httpHeaders;
	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "Lad;"
	)
	final HttpMethod field42;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Ltu;"
	)
	@Export("httpPayload")
	HttpPayload httpPayload;
	@ObfuscatedName("ax")
	@Export("requestInitialized")
	boolean requestInitialized;
	@ObfuscatedName("ao")
	@Export("followRedirects")
	boolean followRedirects;
	@ObfuscatedName("am")
	@ObfuscatedGetter(
		intValue = -2061184109
	)
	@Export("connectionTimeout")
	int connectionTimeout;

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lad;Lrf;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, HttpHeaders var3, boolean var4) throws IOException {
		this.requestInitialized = false;
		this.followRedirects = false;
		this.connectionTimeout = 300000;
		if (!var2.method65()) {
			throw new UnsupportedEncodingException("Unsupported request method used " + var2.getName());
		} else {
			this.connection = (HttpsURLConnection)var1.openConnection();
			if (!var4) {
				HttpsURLConnection var5 = this.connection;
				if (SecureRandomSSLSocketFactory.INSTANCE == null) {
					SecureRandomSSLSocketFactory.INSTANCE = new SecureRandomSSLSocketFactory();
				}

				SecureRandomSSLSocketFactory var6 = SecureRandomSSLSocketFactory.INSTANCE;
				var5.setSSLSocketFactory(var6);
			}

			this.field42 = var2;
			this.httpHeaders = var3 != null ? var3 : new HttpHeaders();
		}
	}

	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;Lad;Z)V"
	)
	public HttpRequest(URL var1, HttpMethod var2, boolean var3) throws IOException {
		this(var1, var2, new HttpHeaders(), var3);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(I)Lrf;",
		garbageValue = "-2032785583"
	)
	@Export("getHeaders")
	public HttpHeaders getHeaders() {
		return this.httpHeaders;
	}

	@ObfuscatedName("ay")
	@ObfuscatedSignature(
		descriptor = "(Ltu;I)V",
		garbageValue = "973352063"
	)
	@Export("setPayload")
	public void setPayload(HttpPayload var1) {
		if (!this.requestInitialized) {
			if (var1 == null) {
				this.httpHeaders.removeHeader("Content-Type");
				this.httpPayload = null;
			} else {
				this.httpPayload = var1;
				if (this.httpPayload.getContentType() != null) {
					this.httpHeaders.contentType(this.httpPayload.getContentType());
				} else {
					this.httpHeaders.removeContentType();
				}

			}
		}
	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "185119612"
	)
	@Export("initializeRequest")
	void initializeRequest() throws ProtocolException {
		if (!this.requestInitialized) {
			this.connection.setRequestMethod(this.field42.getName());
			this.httpHeaders.setRequestProperties(this.connection);
			if (this.field42.method73() && this.httpPayload != null) {
				this.connection.setDoOutput(true);
				ByteArrayOutputStream var1 = new ByteArrayOutputStream();

				try {
					var1.write(this.httpPayload.toBytes());
					var1.writeTo(this.connection.getOutputStream());
				} catch (IOException var11) {
					var11.printStackTrace();
				} finally {
					try {
						var1.close();
					} catch (IOException var10) {
						var10.printStackTrace();
					}

				}
			}

			this.connection.setConnectTimeout(this.connectionTimeout);
			this.connection.setInstanceFollowRedirects(this.followRedirects);
			this.requestInitialized = true;
		}
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-2077114146"
	)
	@Export("connect")
	boolean connect() throws IOException {
		if (!this.requestInitialized) {
			this.initializeRequest();
		}

		this.connection.connect();
		return this.connection.getResponseCode() == -1;
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(I)Lar;",
		garbageValue = "248044064"
	)
	@Export("getResponse")
	HttpResponse getResponse() {
		try {
			if (!this.requestInitialized || this.connection.getResponseCode() == -1) {
				return new HttpResponse("No REST response has been received yet.");
			}
		} catch (IOException var10) {
			this.connection.disconnect();
			return new HttpResponse("Error decoding REST response code: " + var10.getMessage());
		}

		HttpResponse var3;
		try {
			HttpResponse var1 = new HttpResponse(this.connection);
			return var1;
		} catch (IOException var8) {
			var3 = new HttpResponse("Error decoding REST response: " + var8.getMessage());
		} finally {
			this.connection.disconnect();
		}

		return var3;
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lob;II)Lma;",
		garbageValue = "-1758540243"
	)
	@Export("updateExternalPlayer")
	static MusicPatch updateExternalPlayer(AbstractArchive var0, int var1) {
		byte[] var2 = var0.takeFileFlat(var1);
		return var2 == null ? null : new MusicPatch(var2);
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lfb;FB)F",
		garbageValue = "17"
	)
	static float method98(class134 var0, float var1) {
		if (var0 != null && var0.method3194() != 0) {
			if (var1 < (float)var0.field1561[0].field1507) {
				return var0.field1559 == class132.field1540 ? var0.field1561[0].field1501 : ItemContainer.method2395(var0, var1, true);
			} else if (var1 > (float)var0.field1561[var0.method3194() - 1].field1507) {
				return var0.field1560 == class132.field1540 ? var0.field1561[var0.method3194() - 1].field1501 : ItemContainer.method2395(var0, var1, false);
			} else if (var0.field1573) {
				return var0.field1561[0].field1501;
			} else {
				class129 var2 = var0.method3201(var1);
				boolean var3 = false;
				boolean var4 = false;
				if (var2 == null) {
					return 0.0F;
				} else {
					float var5;
					float var6;
					float var7;
					if ((double)var2.field1504 == 0.0D && 0.0D == (double)var2.field1505) {
						var3 = true;
					} else if (var2.field1504 == Float.MAX_VALUE && var2.field1505 == Float.MAX_VALUE) {
						var4 = true;
					} else if (var2.field1500 != null) {
						if (var0.field1569) {
							var5 = (float)var2.field1507;
							float var9 = var2.field1501;
							var6 = var2.field1504 * 0.33333334F + var5;
							float var10 = var9 + var2.field1505 * 0.33333334F;
							float var8 = (float)var2.field1500.field1507;
							float var12 = var2.field1500.field1501;
							var7 = var8 - 0.33333334F * var2.field1500.field1502;
							float var11 = var12 - var2.field1500.field1503 * 0.33333334F;
							if (var0.field1578) {
								float var15 = var10;
								float var16 = var11;
								if (var0 != null) {
									float var17 = var8 - var5;
									if ((double)var17 != 0.0D) {
										float var18 = var6 - var5;
										float var19 = var7 - var5;
										float[] var20 = new float[]{var18 / var17, var19 / var17};
										var0.field1562 = var20[0] == 0.33333334F && var20[1] == 0.6666667F;
										float var21 = var20[0];
										float var22 = var20[1];
										if ((double)var20[0] < 0.0D) {
											var20[0] = 0.0F;
										}

										if ((double)var20[1] > 1.0D) {
											var20[1] = 1.0F;
										}

										if ((double)var20[0] > 1.0D || var20[1] < -1.0F) {
											var20[1] = 1.0F - var20[1];
											if (var20[0] < 0.0F) {
												var20[0] = 0.0F;
											}

											if (var20[1] < 0.0F) {
												var20[1] = 0.0F;
											}

											if (var20[0] > 1.0F || var20[1] > 1.0F) {
												float var23 = (float)((double)var20[1] * ((double)var20[1] - 2.0D) + (double)((var20[1] + (var20[0] - 2.0F)) * var20[0]) + 1.0D);
												if (var23 + class130.field1517 > 0.0F) {
													if (var20[0] + class130.field1517 < 1.3333334F) {
														float var24 = var20[0] - 2.0F;
														float var25 = var20[0] - 1.0F;
														float var26 = (float)Math.sqrt((double)(var24 * var24 - var25 * var25 * 4.0F));
														float var27 = (var26 + -var24) * 0.5F;
														if (var20[1] + class130.field1517 > var27) {
															var20[1] = var27 - class130.field1517;
														} else {
															var27 = (-var24 - var26) * 0.5F;
															if (var20[1] < class130.field1517 + var27) {
																var20[1] = var27 + class130.field1517;
															}
														}
													} else {
														var20[0] = 1.3333334F - class130.field1517;
														var20[1] = 0.33333334F - class130.field1517;
													}
												}
											}

											var20[1] = 1.0F - var20[1];
										}

										if (var21 != var20[0]) {
											float var10000 = var5 + var17 * var20[0];
											if ((double)var21 != 0.0D) {
												var15 = (var10 - var9) * var20[0] / var21 + var9;
											}
										}

										if (var22 != var20[1]) {
											float var14 = var17 * var20[1] + var5;
											if ((double)var22 != 1.0D) {
												var16 = (float)((double)var12 - (double)(var12 - var11) * (1.0D - (double)var20[1]) / (1.0D - (double)var22));
											}
										}

										var0.field1563 = var5;
										var0.field1558 = var8;
										HttpRequestTask.method268(0.0F, var20[0], var20[1], 1.0F, var0);
										class27.method387(var9, var15, var16, var12, var0);
									}
								}
							} else {
								WorldMapData_1.method5847(var0, var5, var6, var7, var8, var9, var10, var11, var12);
							}

							var0.field1569 = false;
						}
					} else {
						var3 = true;
					}

					if (var3) {
						return var2.field1501;
					} else if (var4) {
						return var1 != (float)var2.field1507 && var2.field1500 != null ? var2.field1500.field1501 : var2.field1501;
					} else if (var0.field1578) {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							if (var1 == var0.field1563) {
								var6 = 0.0F;
							} else if (var1 == var0.field1558) {
								var6 = 1.0F;
							} else {
								var6 = (var1 - var0.field1563) / (var0.field1558 - var0.field1563);
							}

							if (var0.field1562) {
								var7 = var6;
							} else {
								class130.field1522[3] = var0.field1568;
								class130.field1522[2] = var0.field1567;
								class130.field1522[1] = var0.field1557;
								class130.field1522[0] = var0.field1571 - var6;
								class130.field1518[0] = 0.0F;
								class130.field1518[1] = 0.0F;
								class130.field1518[2] = 0.0F;
								class130.field1518[3] = 0.0F;
								class130.field1518[4] = 0.0F;
								int var28 = class400.method7482(class130.field1522, 3, 0.0F, true, 1.0F, true, class130.field1518);
								if (var28 == 1) {
									var7 = class130.field1518[0];
								} else {
									var7 = 0.0F;
								}
							}

							var5 = ((var0.field1564 + var0.field1572 * var7) * var7 + var0.field1570) * var7 + var0.field1574;
						}

						return var5;
					} else {
						if (var0 == null) {
							var5 = 0.0F;
						} else {
							var6 = var1 - var0.field1563;
							var5 = var0.field1568 + (var0.field1567 + (var0.field1557 + var6 * var0.field1571) * var6) * var6;
						}

						return var5;
					}
				}
			}
		} else {
			return 0.0F;
		}
	}

	@ObfuscatedName("ab")
	@ObfuscatedSignature(
		descriptor = "(Lob;Lob;ZLqe;I)V",
		garbageValue = "2129803029"
	)
	public static void method84(AbstractArchive var0, AbstractArchive var1, boolean var2, Font var3) {
		ItemComposition.ItemDefinition_archive = var0;
		ItemComposition.ItemDefinition_modelArchive = var1;
		class241.ItemDefinition_inMembersWorld = var2;
		ItemComposition.ItemDefinition_fileCount = ItemComposition.ItemDefinition_archive.getGroupFileCount(10);
		class510.ItemDefinition_fontPlain11 = var3;
	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ZB)V",
		garbageValue = "2"
	)
	@Export("Login_promptCredentials")
	static void Login_promptCredentials(boolean var0) {
		if (!DynamicObject.client.containsAccessAndRefreshToken() && !DynamicObject.client.otlTokenRequesterInitialized() && !DynamicObject.client.containsSessionAndCharacterId()) {
			Login.Login_response1 = "";
			Login.Login_response2 = "Enter your username/email & password.";
			Login.Login_response3 = "";
			class532.updateLoginIndex(2);
			if (var0) {
				Login.Login_password = "";
			}

			class131.method3176();
			class33.focusPasswordWhenUsernameFilled();
		} else {
			class532.updateLoginIndex(10);
		}
	}
}
