import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@ObfuscatedName("ev")
public class class155 {
	@ObfuscatedName("q")
	@ObfuscatedGetter(intValue = 
	-2129786845)

	int field1694;
	@ObfuscatedName("o")
	String field1702;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Lcw;")

	UrlRequest field1696;
	@ObfuscatedName("p")
	String field1704;
	@ObfuscatedName("w")
	float[] field1705;
	@ObfuscatedName("k")
	ArrayList field1706;
	@ObfuscatedName("d")
	ArrayList field1707;
	@ObfuscatedName("m")
	ArrayList field1708;
	@ObfuscatedName("u")
	Map field1709;
	@ObfuscatedName("t")
	Map field1710;

	public class155() {
		this.field1694 = -1;
		this.field1704 = null;
		this.field1705 = new float[4];
		this.field1706 = new ArrayList();
		this.field1707 = new ArrayList();
		this.field1708 = new ArrayList();
		this.field1709 = new HashMap();
		this.field1710 = new HashMap();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;Lck;I)Z", garbageValue = 
	"903767211")

	public boolean method3201(String var1, UrlRequester var2) {
		if ((var1 != null) && (!var1.isEmpty())) {
			if (var2 == null) {
				return false;
			} else {
				this.method3192();

				try {
					this.field1702 = var1;
					this.field1696 = var2.request(new URL(this.field1702));
					this.field1694 = 0;
					return true;
				} catch (MalformedURLException var4) {
					this.method3192();
					this.field1694 = 100;
					return false;
				}
			}
		} else {
			return false;
		}
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(Lck;I)V", garbageValue = 
	"2123246139")

	public void method3184(UrlRequester var1) {
		switch (this.field1694) {
			case 0 :
				this.method3193(var1);
				break;
			case 1 :
				this.method3194();
				break;
			default :
				return;}


	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(I)I", garbageValue = 
	"2027263418")

	public int method3230() {
		return this.field1694;
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;B)I", garbageValue = 
	"125")

	public int method3189(String var1) {
		return this.field1709.containsKey(var1) ? ((Integer) (this.field1709.get(var1))) : -1;
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Ljava/lang/String;I)Ljava/lang/String;", garbageValue = 
	"-1588699273")

	public String method3223(String var1) {
		return ((String) (this.field1710.containsKey(var1) ? this.field1710.get(var1) : null));
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/util/ArrayList;", garbageValue = 
	"1")

	public ArrayList method3187() {
		return this.field1707;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/util/ArrayList;", garbageValue = 
	"1812482567")

	public ArrayList method3229() {
		return this.field1708;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(B)Ljava/lang/String;", garbageValue = 
	"-121")

	public String method3188() {
		return this.field1704;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(I)[F", garbageValue = 
	"1243511271")

	public float[] method3190() {
		return this.field1705;
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(I)Ljava/util/ArrayList;", garbageValue = 
	"969924942")

	public ArrayList method3191() {
		return this.field1706;
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"938648382")

	void method3192() {
		this.field1696 = null;
		this.field1704 = null;
		this.field1705[0] = 0.0F;
		this.field1705[1] = 0.0F;
		this.field1705[2] = 1.0F;
		this.field1705[3] = 1.0F;
		this.field1706.clear();
		this.field1707.clear();
		this.field1708.clear();
		this.field1709.clear();
		this.field1710.clear();
	}

	@ObfuscatedName("p")
	@ObfuscatedSignature(descriptor = 
	"(Lck;B)V", garbageValue = 
	"69")

	void method3193(UrlRequester var1) {
		if ((this.field1696 != null) && this.field1696.isDone()) {
			byte[] var2 = this.field1696.getResponse();
			if (var2 == null) {
				this.method3192();
				this.field1694 = 100;
			} else {
				JSONObject var3;
				try {
					class399 var4 = new class399(var2);
					var3 = var4.method7156();
					var3 = var3.getJSONObject("message");
				} catch (Exception var9) {
					this.method3192();
					this.field1694 = 102;
					return;
				}

				try {
					this.method3195(var3.getJSONArray("images"), var1);
				} catch (Exception var8) {
					this.field1707.clear();
				}

				try {
					this.method3196(var3.getJSONArray("labels"));
				} catch (Exception var7) {
					this.field1708.clear();
				}

				try {
					this.method3197(var3.getJSONObject("behaviour"));
				} catch (Exception var6) {
					this.field1704 = null;
					this.field1705[0] = 0.0F;
					this.field1705[1] = 0.0F;
					this.field1705[2] = 1.0F;
					this.field1705[3] = 1.0F;
					this.field1706.clear();
				}

				try {
					this.method3240(var3.getJSONObject("meta"));
				} catch (Exception var5) {
					this.field1709.clear();
					this.field1710.clear();
				}

				this.field1694 = (this.field1707.size() > 0) ? 1 : 2;
				this.field1696 = null;
			}
		}
	}

	@ObfuscatedName("w")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"-1711663898")

	void method3194() {
		Iterator var1 = this.field1707.iterator();

		class160 var2;
		do {
			if (!var1.hasNext()) {
				var1 = this.field1707.iterator();

				while (var1.hasNext()) {
					var2 = ((class160) (var1.next()));
					if (var2.field1737 != null) {
						byte[] var3 = var2.field1737.getResponse();
						if ((var3 != null) && (var3.length > 0)) {
							this.field1694 = 2;
							return;
						}
					}
				} 

				this.method3192();
				this.field1694 = 101;
				return;
			}

			var2 = ((class160) (var1.next()));
		} while ((var2.field1737 == null) || var2.field1737.isDone() );

	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(Lorg/json/JSONArray;Lck;B)V", garbageValue = 
	"-22")

	void method3195(JSONArray var1, UrlRequester var2) throws JSONException {
		if (var1 != null) {
			for (int var3 = 0; var3 < var1.length(); ++var3) {
				try {
					JSONObject var4 = var1.getJSONObject(var3);
					class160 var5 = new class160(this);
					var5.field1737 = var2.request(new URL(var4.getString("src")));
					var5.field1735 = HorizontalAlignment.method3495(var4, "placement");
					this.field1707.add(var5);
				} catch (MalformedURLException var6) {
				}
			}

		}
	}

	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"(Lorg/json/JSONArray;I)V", garbageValue = 
	"1024784917")

	void method3196(JSONArray var1) throws JSONException {
		if (var1 != null) {
			for (int var2 = 0; var2 < var1.length(); ++var2) {
				JSONObject var3 = var1.getJSONObject(var2);
				class162 var4 = new class162(this);
				var4.field1758 = var3.getString("text");
				String var7 = var3.getString("align_x");
				byte var6;
				if (var7.equals("centre")) {
					var6 = 1;
				} else if ((!var7.equals("bottom")) && (!var7.equals("right"))) {
					var6 = 0;
				} else {
					var6 = 2;
				}

				var4.field1755 = var6;
				String var10 = var3.getString("align_y");
				byte var9;
				if (var10.equals("centre")) {
					var9 = 1;
				} else if ((!var10.equals("bottom")) && (!var10.equals("right"))) {
					var9 = 0;
				} else {
					var9 = 2;
				}

				var4.field1756 = var9;
				var4.field1752 = var3.getInt("font");
				var4.field1754 = HorizontalAlignment.method3495(var3, "placement");
				this.field1708.add(var4);
			}

		}
	}

	@ObfuscatedName("m")
	@ObfuscatedSignature(descriptor = 
	"(Lorg/json/JSONObject;I)V", garbageValue = 
	"222428607")

	void method3197(JSONObject var1) throws JSONException {
		if (var1 != null) {
			this.field1705 = HorizontalAlignment.method3495(var1, "clickbounds");
			this.field1704 = var1.getString("endpoint");
			String[] var2 = JSONObject.getNames(var1);

			for (int var3 = 0; var3 < var1.length(); ++var3) {
				if ((!var2[var3].equals("clickbounds")) && (!var2[var3].equals("endpoint"))) {
					try {
						int var4 = var1.getInt(var2[var3]);
						this.field1706.add(new class163(this, var2[var3], var4));
					} catch (Exception var8) {
						try {
							String var5 = var1.getString(var2[var3]);
							if (var5.equals("true")) {
								this.field1706.add(new class163(this, var2[var3], 1));
							} else if (var5.equals("false")) {
								this.field1706.add(new class163(this, var2[var3], 0));
							} else {
								this.field1706.add(new class154(this, var2[var3], var5));
							}
						} catch (Exception var7) {
						}
					}
				}
			}

		}
	}

	@ObfuscatedName("u")
	@ObfuscatedSignature(descriptor = 
	"(Lorg/json/JSONObject;I)V", garbageValue = 
	"1700168973")

	void method3240(JSONObject var1) throws JSONException {
		String[] var2 = JSONObject.getNames(var1);

		for (int var3 = 0; var3 < var1.length(); ++var3) {
			try {
				int var4 = var1.getInt(var2[var3]);
				this.field1709.put(var2[var3], var4);
			} catch (Exception var8) {
				try {
					String var5 = var1.getString(var2[var3]);
					if (var5.equals("true")) {
						this.field1709.put(var2[var3], 1);
					} else if (var5.equals("false")) {
						this.field1709.put(var2[var3], 0);
					} else {
						this.field1710.put(var2[var3], var5);
					}
				} catch (Exception var7) {
				}
			}
		}

	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(I)[Lkl;", garbageValue = 
	"-124826849")

	static GameBuild[] method3185() {
		return new GameBuild[]{ GameBuild.WIP, GameBuild.RC, GameBuild.BUILDLIVE, GameBuild.LIVE };
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(IB)Z", garbageValue = 
	"-49")

	@Export("loadInterface")
	public static boolean loadInterface(int var0) {
		if (WorldMapSectionType.Widget_loadedInterfaces[var0]) {
			return true;
		} else if (!Widget.Widget_archive.tryLoadGroup(var0)) {
			return false;
		} else {
			int var1 = Widget.Widget_archive.getGroupFileCount(var0);
			if (var1 == 0) {
				WorldMapSectionType.Widget_loadedInterfaces[var0] = true;
				return true;
			} else {
				if (Widget.Widget_interfaceComponents[var0] == null) {
					Widget.Widget_interfaceComponents[var0] = new Widget[var1];
				}

				for (int var2 = 0; var2 < var1; ++var2) {
					if (Widget.Widget_interfaceComponents[var0][var2] == null) {
						byte[] var3 = Widget.Widget_archive.takeFile(var0, var2);
						if (var3 != null) {
							Widget.Widget_interfaceComponents[var0][var2] = new Widget();
							Widget.Widget_interfaceComponents[var0][var2].id = var2 + (var0 << 16);
							if (var3[0] == (-1)) {
								Widget.Widget_interfaceComponents[var0][var2].decode(new Buffer(var3));
							} else {
								Widget.Widget_interfaceComponents[var0][var2].decodeLegacy(new Buffer(var3));
							}
						}
					}
				}

				WorldMapSectionType.Widget_loadedInterfaces[var0] = true;
				return true;
			}
		}
	}

	@ObfuscatedName("kn")
	@ObfuscatedSignature(descriptor = 
	"([Lky;II)V", garbageValue = 
	"-609081385")

	@Export("runComponentCloseListeners")
	static final void runComponentCloseListeners(Widget[] var0, int var1) {
		for (int var2 = 0; var2 < var0.length; ++var2) {
			Widget var3 = var0[var2];
			if (var3 != null) {
				if (var3.type == 0) {
					if (var3.children != null) {
						runComponentCloseListeners(var3.children, var1);
					}

					InterfaceParent var4 = ((InterfaceParent) (Client.interfaceParents.get(((long) (var3.id)))));
					if (var4 != null) {
						MouseRecorder.runIntfCloseListeners(var4.group, var1);
					}
				}

				ScriptEvent var5;
				if ((var1 == 0) && (var3.onDialogAbort != null)) {
					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onDialogAbort;
					ClanSettings.runScriptEvent(var5);
				}

				if ((var1 == 1) && (var3.onSubChange != null)) {
					if (var3.childIndex >= 0) {
						Widget var6 = class127.getWidget(var3.id);
						if ((((var6 == null) || (var6.children == null)) || (var3.childIndex >= var6.children.length)) || (var3 != var6.children[var3.childIndex])) {
							continue;
						}
					}

					var5 = new ScriptEvent();
					var5.widget = var3;
					var5.args = var3.onSubChange;
					ClanSettings.runScriptEvent(var5);
				}
			}
		}

	}
}