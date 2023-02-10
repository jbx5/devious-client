import java.lang.reflect.Field;
import java.lang.reflect.Method;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("ap")
@Implements("ReflectionCheck")
public class ReflectionCheck extends Node {
   @ObfuscatedName("p")
   @ObfuscatedGetter(
      intValue = 827423307
   )
   static int field279;
   @ObfuscatedName("f")
   @Export("intReplaceValues")
   int[] intReplaceValues;
   @ObfuscatedName("w")
   @ObfuscatedGetter(
      intValue = 1102112513
   )
   @Export("id")
   int id;
   @ObfuscatedName("v")
   @ObfuscatedGetter(
      intValue = -1398282557
   )
   @Export("size")
   int size;
   @ObfuscatedName("s")
   @Export("operations")
   int[] operations;
   @ObfuscatedName("z")
   @Export("creationErrors")
   int[] creationErrors;
   @ObfuscatedName("j")
   @Export("fields")
   Field[] fields;
   @ObfuscatedName("i")
   @Export("methods")
   Method[] methods;
   @ObfuscatedName("n")
   @Export("arguments")
   byte[][][] arguments;

   ReflectionCheck() {
   }

   @ObfuscatedName("v")
   @ObfuscatedSignature(
      descriptor = "(IB)Lel;",
      garbageValue = "-10"
   )
   static class134 method695(int var0) {
      class134[] var1 = new class134[]{class134.field1621, class134.field1607, class134.field1608, class134.field1609, class134.field1610, class134.field1617, class134.field1612, class134.field1611, class134.field1614};
      class134 var2 = (class134)class4.findEnumerated(var1, var0);
      if (var2 == null) {
         var2 = class134.field1614;
      }

      return var2;
   }

   @ObfuscatedName("g")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "-1054258097"
   )
   static void method696(int var0) {
      if (var0 != Login.loginIndex) {
         Login.loginIndex = var0;
      }
   }

   @ObfuscatedName("ft")
   @ObfuscatedSignature(
      descriptor = "(IZZZZI)Llm;",
      garbageValue = "1953973237"
   )
   @Export("newArchive")
   static Archive newArchive(int var0, boolean var1, boolean var2, boolean var3, boolean var4) {
      ArchiveDisk var5 = null;
      if (JagexCache.JagexCache_dat2File != null) {
         var5 = new ArchiveDisk(var0, JagexCache.JagexCache_dat2File, class18.JagexCache_idxFiles[var0], 1000000);
      }

      return new Archive(var5, class12.masterDisk, var0, var1, var2, var3, var4);
   }

   @ObfuscatedName("kg")
   @ObfuscatedSignature(
      descriptor = "(IB)V",
      garbageValue = "17"
   )
   @Export("changeGameOptions")
   static final void changeGameOptions(int var0) {
      class123.method3032();

      for(ObjectSound var1 = (ObjectSound)ObjectSound.objectSounds.last(); var1 != null; var1 = (ObjectSound)ObjectSound.objectSounds.previous()) {
         if (var1.obj != null) {
            var1.set();
         }
      }

      int var3 = TaskHandler.VarpDefinition_get(var0).type;
      if (var3 != 0) {
         int var2 = Varps.Varps_main[var0];
         if (var3 == 1) {
            if (var2 == 1) {
               Rasterizer3D.Rasterizer3D_setBrightness(0.9);
               ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.9);
               ItemComposition.ItemDefinition_cachedSprites.clear();
               PacketWriter.clientPreferences.method2583(0.9);
            }

            if (var2 == 2) {
               Rasterizer3D.Rasterizer3D_setBrightness(0.8);
               ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.8);
               ItemComposition.ItemDefinition_cachedSprites.clear();
               PacketWriter.clientPreferences.method2583(0.8);
            }

            if (var2 == 3) {
               Rasterizer3D.Rasterizer3D_setBrightness(0.7);
               ((TextureProvider)Rasterizer3D.Rasterizer3D_textureLoader).setBrightness(0.7);
               ItemComposition.ItemDefinition_cachedSprites.clear();
               PacketWriter.clientPreferences.method2583(0.7);
            }

            if (var2 == 4) {
               Actor.method2440(0.6);
            }
         }

         if (var3 == 3) {
            if (var2 == 0) {
               Player.method2369(255);
            }

            if (var2 == 1) {
               Player.method2369(192);
            }

            if (var2 == 2) {
               Player.method2369(128);
            }

            if (var2 == 3) {
               Player.method2369(64);
            }

            if (var2 == 4) {
               Player.method2369(0);
            }
         }

         if (var3 == 4) {
            if (var2 == 0) {
               class203.method4128(127);
            }

            if (var2 == 1) {
               class203.method4128(96);
            }

            if (var2 == 2) {
               class203.method4128(64);
            }

            if (var2 == 3) {
               class203.method4128(32);
            }

            if (var2 == 4) {
               class203.method4128(0);
            }
         }

         if (var3 == 5) {
            Client.leftClickOpensMenu = var2 == 1;
         }

         if (var3 == 6) {
            Client.chatEffects = var2;
         }

         if (var3 == 9) {
            Client.field679 = var2;
         }

         if (var3 == 10) {
            if (var2 == 0) {
               NPC.method2678(127);
            }

            if (var2 == 1) {
               NPC.method2678(96);
            }

            if (var2 == 2) {
               NPC.method2678(64);
            }

            if (var2 == 3) {
               NPC.method2678(32);
            }

            if (var2 == 4) {
               NPC.method2678(0);
            }
         }

         if (var3 == 17) {
            Client.followerIndex = var2 & '\uffff';
         }

         if (var3 == 18) {
            Client.playerAttackOption = (AttackOption)class4.findEnumerated(WorldMapArea.method5012(), var2);
            if (Client.playerAttackOption == null) {
               Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

         if (var3 == 19) {
            if (var2 == -1) {
               Client.combatTargetPlayerIndex = -1;
            } else {
               Client.combatTargetPlayerIndex = var2 & 2047;
            }
         }

         if (var3 == 22) {
            Client.npcAttackOption = (AttackOption)class4.findEnumerated(WorldMapArea.method5012(), var2);
            if (Client.npcAttackOption == null) {
               Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

      }
   }
}
