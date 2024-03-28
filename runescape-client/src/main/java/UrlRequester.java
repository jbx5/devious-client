import java.io.DataInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ea")
@Implements("UrlRequester")
public abstract class UrlRequester implements Runnable {
	@ObfuscatedName("ag")
	public static short[][] field1454;
	@ObfuscatedName("ex")
	@ObfuscatedSignature(
		descriptor = "Lov;"
	)
	static Archive field1452;
	@ObfuscatedName("fo")
	@ObfuscatedGetter(
		intValue = 1555622417
	)
	static int field1453;
	@ObfuscatedName("az")
	@Export("requestThread")
	final Thread requestThread;
	@ObfuscatedName("ah")
	@Export("isClosed")
	volatile boolean isClosed;
	@ObfuscatedName("af")
	@Export("requests")
	Queue requests;
	@ObfuscatedName("at")
	@ObfuscatedGetter(
		intValue = 1698107757
	)
	@Export("clientRevision")
	int clientRevision;

	UrlRequester(int var1) {
		this.requests = new LinkedList();
		this.requestThread = new Thread(this);
		this.requestThread.setPriority(1);
		this.requestThread.start();
		this.clientRevision = var1;
	}

	@ObfuscatedName("az")
	@ObfuscatedSignature(
		descriptor = "(Lel;I)V",
		garbageValue = "1625450923"
	)
	@Export("openConnection")
	abstract void openConnection(UrlRequest var1) throws IOException;

	@ObfuscatedName("ah")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)I",
		garbageValue = "1958691031"
	)
	int method2804(URLConnection var1) {
		int var2 = UrlRequest.field1464;
		if (var1 != null) {
			try {
				if (var1 instanceof HttpURLConnection) {
					var2 = ((HttpURLConnection)var1).getResponseCode();
				}
			} catch (IOException var4) {
			}
		}

		return var2;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;I)V",
		garbageValue = "-383350647"
	)
	@Export("setDefaultRequestProperties")
	void setDefaultRequestProperties(URLConnection var1) {
		var1.setConnectTimeout(5000);
		var1.setReadTimeout(5000);
		var1.setUseCaches(false);
		var1.setRequestProperty("Connection", "close");
		var1.setRequestProperty("User-Agent", "OldSchoolRuneScape/" + this.clientRevision);
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URLConnection;Lel;B)V",
		garbageValue = "-45"
	)
	void method2806(URLConnection var1, UrlRequest var2) {
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
				byte[] var6 = class195.ByteArrayPool_getArray(5000);

				for (int var7 = var3.read(var6); var7 > -1; var7 = var3.read(var6)) {
					byte[] var8 = new byte[var4.length + var7];
					System.arraycopy(var4, 0, var8, 0, var4.length);
					System.arraycopy(var6, 0, var8, var4.length, var7);
					var4 = var8;
				}

				WorldMapIcon_0.ByteArrayPool_release(var6);
			}

			var2.response0 = var4;
		} catch (IOException var14) {
			var2.response0 = null;
		} finally {
			var2.field1465 = this.method2804(var1);
		}

		if (var3 != null) {
			try {
				var3.close();
			} catch (IOException var13) {
			}
		}

	}

	@ObfuscatedName("an")
	@ObfuscatedSignature(
		descriptor = "(Ljava/net/URL;B)Lel;",
		garbageValue = "73"
	)
	@Export("request")
	public UrlRequest request(URL var1) {
		UrlRequest var2 = new UrlRequest(var1);
		synchronized(this) {
			this.requests.add(var2);
			this.notify();
			return var2;
		}
	}

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "9"
	)
	@Export("close")
	public void close() {
		this.isClosed = true;

		try {
			synchronized(this) {
				this.notify();
			}

			this.requestThread.join();
		} catch (InterruptedException var4) {
		}

	}

	public void run() {
		while (!this.isClosed) {
			try {
				UrlRequest var1;
				synchronized(this) {
					var1 = (UrlRequest)this.requests.poll();
					if (var1 == null) {
						try {
							this.wait();
						} catch (InterruptedException var5) {
						}
						continue;
					}
				}

				this.openConnection(var1);
			} catch (Exception var7) {
				class180.RunException_sendStackTrace((String)null, var7);
			}
		}

	}

	@ObfuscatedName("aw")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-481908362"
	)
	static int method2833(int var0, Script var1, boolean var2) {
		Widget var3;
		if (var0 >= 2000) {
			var0 -= 1000;
			var3 = class243.widgetDefinition.method6281(Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize]);
		} else {
			var3 = var2 ? class475.scriptDotWidget : class535.scriptActiveWidget;
		}

		WorldMapData_0.invalidateWidget(var3);
		int var4;
		int var5;
		if (var0 != ScriptOpcodes.CC_SETOBJECT && var0 != ScriptOpcodes.CC_SETOBJECT_NONUM && var0 != ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM) {
			if (var0 == ScriptOpcodes.CC_SETNPCHEAD) {
				var3.modelType = 2;
				var3.modelId = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				return 1;
			} else if (var0 == ScriptOpcodes.CC_SETPLAYERHEAD_SELF) {
				var3.modelType = 3;
				var3.modelId = class133.localPlayer.appearance.getChatHeadId();
				return 1;
			} else if (var0 == 1207) {
				boolean var7 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize] == 1;
				ChatChannel.method2212(var3, class133.localPlayer.appearance, var7);
				return 1;
			} else if (var0 == 1208) {
				var4 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				if (var3.field3801 == null) {
					throw new RuntimeException("");
				} else {
					Actor.method2413(var3, var4);
					return 1;
				}
			} else if (var0 == 1209) {
				HttpRequestTask.Interpreter_intStackSize -= 2;
				var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
				var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
				if (var3.field3801 == null) {
					throw new RuntimeException("");
				} else {
					HorizontalAlignment.method3854(var3, var4, var5);
					return 1;
				}
			} else if (var0 == 1210) {
				var4 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
				if (var3.field3801 == null) {
					throw new RuntimeException("");
				} else {
					PacketBufferNode.method5921(var3, class133.localPlayer.appearance.gender, var4);
					return 1;
				}
			} else {
				return 2;
			}
		} else {
			HttpRequestTask.Interpreter_intStackSize -= 2;
			var4 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize];
			var5 = Interpreter.Interpreter_intStack[HttpRequestTask.Interpreter_intStackSize + 1];
			var3.itemId = var4;
			var3.itemQuantity = var5;
			ItemComposition var6 = HttpRequest.ItemDefinition_get(var4);
			var3.modelAngleX = var6.xan2d;
			var3.modelAngleY = var6.yan2d;
			var3.modelAngleZ = var6.zan2d;
			var3.modelOffsetX = var6.offsetX2d;
			var3.modelOffsetY = var6.offsetY2d;
			var3.modelZoom = var6.zoom2d;
			if (var0 == ScriptOpcodes.CC_SETOBJECT_NONUM) {
				var3.itemQuantityMode = 0;
			} else if (var0 == ScriptOpcodes.CC_SETOBJECT_ALWAYS_NUM | 1 == var6.isStackable) {
				var3.itemQuantityMode = 1;
			} else {
				var3.itemQuantityMode = 2;
			}

			if (var3.field3799 > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.field3799;
			} else if (var3.rawWidth > 0) {
				var3.modelZoom = var3.modelZoom * 32 / var3.rawWidth;
			}

			return 1;
		}
	}

	@ObfuscatedName("bc")
	@ObfuscatedSignature(
		descriptor = "(ILdn;ZI)I",
		garbageValue = "-747589187"
	)
	static int method2831(int var0, Script var1, boolean var2) {
		int var3;
		if (var0 == 3500) {
			var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.indexCheck.isValidIndexInRange(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3501) {
			var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.indexCheck.method4333(var3) ? 1 : 0;
			return 1;
		} else if (var0 == 3502) {
			var3 = Interpreter.Interpreter_intStack[--HttpRequestTask.Interpreter_intStackSize];
			Interpreter.Interpreter_intStack[++HttpRequestTask.Interpreter_intStackSize - 1] = Client.indexCheck.method4319(var3) ? 1 : 0;
			return 1;
		} else {
			return 2;
		}
	}

	@ObfuscatedName("nq")
	@ObfuscatedSignature(
		descriptor = "(IIIB)Ldv;",
		garbageValue = "44"
	)
	@Export("openInterface")
	static final InterfaceParent openInterface(int var0, int var1, int var2) {
		InterfaceParent var3 = new InterfaceParent();
		var3.group = var1;
		var3.type = var2;
		Client.interfaceParents.put(var3, (long)var0);
		ApproximateRouteStrategy.method1186(var1);
		Widget var4 = class243.widgetDefinition.method6281(var0);
		WorldMapData_0.invalidateWidget(var4);
		if (Client.meslayerContinueWidget != null) {
			WorldMapData_0.invalidateWidget(Client.meslayerContinueWidget);
			Client.meslayerContinueWidget = null;
		}

		IsaacCipher.revalidateWidgetScroll(class243.widgetDefinition.Widget_interfaceComponents[var0 >> 16], var4, false);
		KeyHandler.runWidgetOnLoadListener(var1);
		if (Client.rootInterface != -1) {
			Login.runIntfCloseListeners(Client.rootInterface, 1);
		}

		return var3;
	}
}
