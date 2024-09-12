import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fb")
public class class134 {
	@ObfuscatedName("fj")
	@ObfuscatedSignature(
		descriptor = "Lof;"
	)
	static Archive field1578;
	@ObfuscatedName("ac")
	@ObfuscatedGetter(
		intValue = -563736223
	)
	public final int field1581;
	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "Lfb;"
	)
	public class134 field1569;
	@ObfuscatedName("ag")
	float[][] field1575;
	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "[Lqf;"
	)
	final TransformationMatrix[] field1573;
	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "[Lqf;"
	)
	TransformationMatrix[] field1571;
	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "[Lqf;"
	)
	TransformationMatrix[] field1574;
	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	TransformationMatrix field1585;
	@ObfuscatedName("at")
	boolean field1576;
	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	TransformationMatrix field1577;
	@ObfuscatedName("ar")
	boolean field1572;
	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "Lqf;"
	)
	TransformationMatrix field1579;
	@ObfuscatedName("ad")
	float[][] field1580;
	@ObfuscatedName("ah")
	float[][] field1583;
	@ObfuscatedName("ap")
	float[][] field1582;

	@ObfuscatedSignature(
		descriptor = "(ILvf;Z)V"
	)
	public class134(int var1, Buffer var2, boolean var3) {
		this.field1585 = new TransformationMatrix();
		this.field1576 = true;
		this.field1577 = new TransformationMatrix();
		this.field1572 = true;
		this.field1579 = new TransformationMatrix();
		this.field1581 = var2.readShort();
		this.field1573 = new TransformationMatrix[var1];
		this.field1571 = new TransformationMatrix[this.field1573.length];
		this.field1574 = new TransformationMatrix[this.field1573.length];
		this.field1575 = new float[this.field1573.length][3];

		for (int var4 = 0; var4 < this.field1573.length; ++var4) {
			this.field1573[var4] = new TransformationMatrix(var2, var3);
			this.field1575[var4][0] = var2.method9934();
			this.field1575[var4][1] = var2.method9934();
			this.field1575[var4][2] = var2.method9934();
		}

		this.method3276();
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-2126074356"
	)
	void method3276() {
		this.field1580 = new float[this.field1573.length][3];
		this.field1583 = new float[this.field1573.length][3];
		this.field1582 = new float[this.field1573.length][3];
		TransformationMatrix var1 = class172.method3757();

		for (int var2 = 0; var2 < this.field1573.length; ++var2) {
			TransformationMatrix var3 = this.method3285(var2);
			var1.method8132(var3);
			var1.method8139();
			this.field1580[var2] = var1.method8129();
			this.field1583[var2][0] = var3.field4737[12];
			this.field1583[var2][1] = var3.field4737[13];
			this.field1583[var2][2] = var3.field4737[14];
			this.field1582[var2] = var3.method8145();
		}

		var1.method8125();
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(II)Lqf;",
		garbageValue = "1790433551"
	)
	TransformationMatrix method3285(int var1) {
		return this.field1573[var1];
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(II)Lqf;",
		garbageValue = "1282771416"
	)
	TransformationMatrix method3278(int var1) {
		if (this.field1571[var1] == null) {
			this.field1571[var1] = new TransformationMatrix(this.method3285(var1));
			if (this.field1569 != null) {
				this.field1571[var1].method8135(this.field1569.method3278(var1));
			} else {
				this.field1571[var1].method8135(TransformationMatrix.field4733);
			}
		}

		return this.field1571[var1];
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(II)Lqf;",
		garbageValue = "780352272"
	)
	TransformationMatrix method3279(int var1) {
		if (this.field1574[var1] == null) {
			this.field1574[var1] = new TransformationMatrix(this.method3278(var1));
			this.field1574[var1].method8139();
		}

		return this.field1574[var1];
	}

	@ObfuscatedName("ax")
	@ObfuscatedSignature(
		descriptor = "(Lqf;I)V",
		garbageValue = "-1688333975"
	)
	void method3307(TransformationMatrix var1) {
		this.field1585.method8132(var1);
		this.field1576 = true;
		this.field1572 = true;
	}

	@ObfuscatedName("aq")
	@ObfuscatedSignature(
		descriptor = "(B)Lqf;",
		garbageValue = "35"
	)
	TransformationMatrix method3281() {
		return this.field1585;
	}

	@ObfuscatedName("af")
	@ObfuscatedSignature(
		descriptor = "(I)Lqf;",
		garbageValue = "-42227819"
	)
	TransformationMatrix method3283() {
		if (this.field1576) {
			this.field1577.method8132(this.method3281());
			if (this.field1569 != null) {
				this.field1577.method8135(this.field1569.method3283());
			}

			this.field1576 = false;
		}

		return this.field1577;
	}

	@ObfuscatedName("at")
	@ObfuscatedSignature(
		descriptor = "(IB)Lqf;",
		garbageValue = "-67"
	)
	public TransformationMatrix method3282(int var1) {
		if (this.field1572) {
			this.field1579.method8132(this.method3279(var1));
			this.field1579.method8135(this.method3283());
			this.field1572 = false;
		}

		return this.field1579;
	}

	@ObfuscatedName("au")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "5452961"
	)
	float[] method3309(int var1) {
		return this.field1580[var1];
	}

	@ObfuscatedName("ar")
	@ObfuscatedSignature(
		descriptor = "(IB)[F",
		garbageValue = "2"
	)
	float[] method3284(int var1) {
		return this.field1583[var1];
	}

	@ObfuscatedName("al")
	@ObfuscatedSignature(
		descriptor = "(II)[F",
		garbageValue = "1003006583"
	)
	float[] method3294(int var1) {
		return this.field1582[var1];
	}

	@ObfuscatedName("ml")
	@ObfuscatedSignature(
		descriptor = "(S)V",
		garbageValue = "-22197"
	)
	static void method3310() {
		if (Client.isSpellSelected) {
			Widget var0 = TaskHandler.widgetDefinition.getWidgetChild(class36.selectedSpellWidget, Client.selectedSpellChildIndex);
			if (var0 != null && var0.onTargetLeave != null) {
				ScriptEvent var1 = new ScriptEvent();
				var1.widget = var0;
				var1.args = var0.onTargetLeave;
				class215.runScriptEvent(var1);
			}

			Client.selectedSpellItemId = -1;
			Client.isSpellSelected = false;
			SecureRandomCallable.invalidateWidget(var0);
		}
	}
}
