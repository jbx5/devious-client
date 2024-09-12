import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("dv")
@Implements("SecureRandomFuture")
public class SecureRandomFuture {
	@ObfuscatedName("gp")
	@ObfuscatedGetter(
		intValue = 1805236159
	)
	static int field1019;
	@ObfuscatedName("ac")
	@Export("executor")
	ExecutorService executor;
	@ObfuscatedName("ae")
	@Export("future")
	Future future;

	SecureRandomFuture() {
		this.executor = Executors.newSingleThreadExecutor();
		this.future = this.executor.submit(new SecureRandomCallable());
	}

	@ObfuscatedName("ac")
	@ObfuscatedSignature(
		descriptor = "(I)V",
		garbageValue = "-1928656312"
	)
	@Export("shutdown")
	void shutdown() {
		this.executor.shutdown();
		this.executor = null;
	}

	@ObfuscatedName("ae")
	@ObfuscatedSignature(
		descriptor = "(I)Z",
		garbageValue = "-1034908456"
	)
	@Export("isDone")
	boolean isDone() {
		return this.future.isDone();
	}

	@ObfuscatedName("ag")
	@ObfuscatedSignature(
		descriptor = "(I)Ljava/security/SecureRandom;",
		garbageValue = "844691753"
	)
	@Export("get")
	SecureRandom get() {
		try {
			return (SecureRandom)this.future.get();
		} catch (Exception var4) {
			SecureRandom var3 = new SecureRandom();
			var3.nextInt();
			return var3;
		}
	}

	@ObfuscatedName("am")
	@ObfuscatedSignature(
		descriptor = "(IZIZI)V",
		garbageValue = "1677590448"
	)
	@Export("sortWorldList")
	static void sortWorldList(int var0, boolean var1, int var2, boolean var3) {
		if (SoundSystem.World_worlds != null) {
			class332.doWorldSorting(0, SoundSystem.World_worlds.length - 1, var0, var1, var2, var3);
		}

	}

	@ObfuscatedName("jz")
	@ObfuscatedSignature(
		descriptor = "(Ldd;I)V",
		garbageValue = "253417057"
	)
	static void method2379(WorldView var0) {
		int var1 = 0;

		for (int var2 = 0; var2 < var0.worldEntityCount; ++var2) {
			WorldEntity var3 = var0.worldEntities[var0.worldEntityIndices[var2]];
			if (var3 != null) {
				boolean var4 = var3.worldView.id == HealthBarUpdate.field1304;
				if (!var4) {
					boolean var5 = var1 < Client.field811;
					if (!var5) {
						continue;
					}

					++var1;
				}

				var3.tileHeight = VarcInt.getTileHeight(var0, var3.x, var3.y, var0.plane);
				var3.worldView.scene.cycle = Client.cycle;
				var3.initScenePlane();
				var0.scene.drawEntity(var0.plane, var3.x, var3.y, var3.tileHeight, 60, var3.worldView.scene, var3.currentRotationAngle, 0L, false);
				IgnoreList.method8786(var3.worldView);
				WorldView var10 = var3.worldView;
				if (Client.combatTargetPlayerIndex >= 0 && var10.players[Client.combatTargetPlayerIndex] != null) {
					Decimator.addPlayerToScene(var10, Client.combatTargetPlayerIndex, false);
				}

				class132.addNpcsToScene(var3.worldView, true);
				WorldView var6 = var3.worldView;
				int var7 = Client.playerUpdateManager.playerCount;
				int[] var8 = Client.playerUpdateManager.playerIndices;

				for (int var9 = 0; var9 < var7; ++var9) {
					if (var8[var9] != Client.combatTargetPlayerIndex && var8[var9] != Client.localPlayerIndex) {
						Decimator.addPlayerToScene(var6, var8[var9], true);
					}
				}

				class132.addNpcsToScene(var3.worldView, false);
				class7.method55(var3.worldView);
				WorldView var11 = var3.worldView;

				for (GraphicsObject var12 = (GraphicsObject)var11.graphicsObjects.last(); var12 != null; var12 = (GraphicsObject)var11.graphicsObjects.previous()) {
					if (var12.plane == var11.plane && !var12.isFinished) {
						if (Client.cycle >= var12.cycleStart) {
							var12.advance(Client.graphicsCycle);
							if (var12.isFinished) {
								var12.remove();
							} else {
								var11.scene.drawEntity(var12.plane, var12.x, var12.y, var12.z, 60, var12, 0, -1L, false);
							}
						}
					} else {
						var12.remove();
					}
				}
			}
		}

	}
}
