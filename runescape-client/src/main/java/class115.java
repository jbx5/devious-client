import net.runelite.mapping.Export;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("da")
public class class115 {
	@ObfuscatedName("d")
	@ObfuscatedSignature(descriptor = 
	"[Lpb;")

	@Export("JagexCache_idxFiles")
	public static BufferedFile[] JagexCache_idxFiles;
	@ObfuscatedName("v")
	@ObfuscatedGetter(intValue = 
	-671595341)

	public final int field1395;
	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"Lda;")

	public class115 field1388;
	@ObfuscatedName("i")
	float[][] field1385;
	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"[Lnt;")

	final class387[] field1386;
	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"[Lnt;")

	class387[] field1387;
	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"[Lnt;")

	class387[] field1383;
	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"Lnt;")

	class387 field1389;
	@ObfuscatedName("l")
	boolean field1392;
	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"Lnt;")

	class387 field1384;
	@ObfuscatedName("o")
	boolean field1391;
	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"Lnt;")

	class387 field1393;
	@ObfuscatedName("p")
	float[][] field1394;
	@ObfuscatedName("w")
	float[][] field1390;
	@ObfuscatedName("k")
	float[][] field1396;

	@ObfuscatedSignature(descriptor = 
	"(ILpi;Z)V")

	public class115(int var1, Buffer var2, boolean var3) {
		this.field1389 = new class387();
		this.field1392 = true;
		this.field1384 = new class387();
		this.field1391 = true;
		this.field1393 = new class387();
		this.field1395 = var2.readShort();
		this.field1386 = new class387[var1];
		this.field1387 = new class387[this.field1386.length];
		this.field1383 = new class387[this.field1386.length];
		this.field1385 = new float[this.field1386.length][3];

		for (int var4 = 0; var4 < this.field1386.length; ++var4) {
			this.field1386[var4] = new class387(var2, var3);
			this.field1385[var4][0] = var2.method7681();
			this.field1385[var4][1] = var2.method7681();
			this.field1385[var4][2] = var2.method7681();
		}

		this.method2664();
	}

	@ObfuscatedName("v")
	@ObfuscatedSignature(descriptor = 
	"(B)V", garbageValue = 
	"-23")

	void method2664() {
		this.field1394 = new float[this.field1386.length][3];
		this.field1390 = new float[this.field1386.length][3];
		this.field1396 = new float[this.field1386.length][3];
		class387 var1;
		synchronized(class387.field4346) {
			if (class387.field4347 == 0) {
				var1 = new class387();
			} else {
				class387.field4346[--class387.field4347].method7011();
				var1 = class387.field4346[class387.field4347];
			}
		}

		class387 var2 = var1;

		for (int var5 = 0; var5 < this.field1386.length; ++var5) {
			class387 var4 = this.method2665(var5);
			var2.method7032(var4);
			var2.method7021();
			this.field1394[var5] = var2.method7010();
			this.field1390[var5][0] = var4.field4348[12];
			this.field1390[var5][1] = var4.field4348[13];
			this.field1390[var5][2] = var4.field4348[14];
			this.field1396[var5] = var4.method7023();
		}

		var2.method7029();
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(descriptor = 
	"(II)Lnt;", garbageValue = 
	"1022205323")

	class387 method2665(int var1) {
		return this.field1386[var1];
	}

	@ObfuscatedName("i")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lnt;", garbageValue = 
	"85")

	class387 method2666(int var1) {
		if (this.field1387[var1] == null) {
			this.field1387[var1] = new class387(this.method2665(var1));
			if (this.field1388 != null) {
				this.field1387[var1].method7017(this.field1388.method2666(var1));
			} else {
				this.field1387[var1].method7017(class387.field4345);
			}
		}

		return this.field1387[var1];
	}

	@ObfuscatedName("f")
	@ObfuscatedSignature(descriptor = 
	"(II)Lnt;", garbageValue = 
	"-1203957232")

	class387 method2667(int var1) {
		if (this.field1383[var1] == null) {
			this.field1383[var1] = new class387(this.method2666(var1));
			this.field1383[var1].method7021();
		}

		return this.field1383[var1];
	}

	@ObfuscatedName("b")
	@ObfuscatedSignature(descriptor = 
	"(Lnt;I)V", garbageValue = 
	"2046672010")

	void method2676(class387 var1) {
		this.field1389.method7032(var1);
		this.field1392 = true;
		this.field1391 = true;
	}

	@ObfuscatedName("n")
	@ObfuscatedSignature(descriptor = 
	"(B)Lnt;", garbageValue = 
	"54")

	class387 method2678() {
		return this.field1389;
	}

	@ObfuscatedName("s")
	@ObfuscatedSignature(descriptor = 
	"(B)Lnt;", garbageValue = 
	"-12")

	class387 method2669() {
		if (this.field1392) {
			this.field1384.method7032(this.method2678());
			if (this.field1388 != null) {
				this.field1384.method7017(this.field1388.method2669());
			}

			this.field1392 = false;
		}

		return this.field1384;
	}

	@ObfuscatedName("l")
	@ObfuscatedSignature(descriptor = 
	"(IB)Lnt;", garbageValue = 
	"-47")

	public class387 method2671(int var1) {
		if (this.field1391) {
			this.field1393.method7032(this.method2667(var1));
			this.field1393.method7017(this.method2669());
			this.field1391 = false;
		}

		return this.field1393;
	}

	@ObfuscatedName("q")
	@ObfuscatedSignature(descriptor = 
	"(II)[F", garbageValue = 
	"-101383971")

	float[] method2672(int var1) {
		return this.field1394[var1];
	}

	@ObfuscatedName("o")
	@ObfuscatedSignature(descriptor = 
	"(II)[F", garbageValue = 
	"-748184127")

	float[] method2673(int var1) {
		return this.field1390[var1];
	}

	@ObfuscatedName("r")
	@ObfuscatedSignature(descriptor = 
	"(IB)[F", garbageValue = 
	"9")

	float[] method2674(int var1) {
		return this.field1396[var1];
	}

	@ObfuscatedName("k")
	@ObfuscatedSignature(descriptor = 
	"(II)Lim;", garbageValue = 
	"1491781541")

	@Export("getFrames")
	static Frames getFrames(int var0) {
		Frames var1 = ((Frames) (SequenceDefinition.SequenceDefinition_cachedFrames.get(((long) (var0)))));
		if (var1 != null) {
			return var1;
		} else {
			var1 = HealthBarUpdate.method2185(SequenceDefinition.SequenceDefinition_animationsArchive, SequenceDefinition.SequenceDefinition_skeletonsArchive, var0, false);
			if (var1 != null) {
				SequenceDefinition.SequenceDefinition_cachedFrames.put(var1, ((long) (var0)));
			}

			return var1;
		}
	}

	@ObfuscatedName("ky")
	@ObfuscatedSignature(descriptor = 
	"(II)V", garbageValue = 
	"246529128")

	static final void method2680(int var0) {
		if (class155.loadInterface(var0)) {
			class119.drawModelComponents(Widget.Widget_interfaceComponents[var0], -1);
		}
	}

	@ObfuscatedName("mq")
	@ObfuscatedSignature(descriptor = 
	"(I)V", garbageValue = 
	"2141464292")

	static void method2684() {
		if (VarcInt.field1841 != null) {
			Client.field779 = Client.cycle;
			VarcInt.field1841.method6057();

			for (int var0 = 0; var0 < Client.players.length; ++var0) {
				if (Client.players[var0] != null) {
					VarcInt.field1841.method6044((Client.players[var0].x >> 7) + GrandExchangeOfferOwnWorldComparator.baseX, (Client.players[var0].y >> 7) + VarcInt.baseY);
				}
			}
		}

	}
}