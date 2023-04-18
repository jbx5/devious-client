import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("fa")
public class class142 {
   @ObfuscatedName("af")
   @ObfuscatedGetter(
      longValue = -7997171180678003627L
   )
   long field1661;
   @ObfuscatedName("an")
   @ObfuscatedGetter(
      intValue = 1818498225
   )
   int field1657 = -1;
   @ObfuscatedName("aw")
   @ObfuscatedSignature(
      descriptor = "Loi;"
   )
   IterableNodeDeque field1658 = new IterableNodeDeque();

   @ObfuscatedSignature(
      descriptor = "(Lsg;)V"
   )
   public class142(Buffer var1) {
      this.method3234(var1);
   }

   @ObfuscatedName("af")
   @ObfuscatedSignature(
      descriptor = "(Lsg;I)V",
      garbageValue = "-1541444446"
   )
   void method3234(Buffer var1) {
      this.field1661 = var1.readLong();
      this.field1657 = var1.readInt();

      for(int var2 = var1.readUnsignedByte(); var2 != 0; var2 = var1.readUnsignedByte()) {
         Object var3;
         if (var2 == 3) {
            var3 = new class161(this);
         } else if (var2 == 1) {
            var3 = new class137(this);
         } else if (var2 == 13) {
            var3 = new class154(this);
         } else if (var2 == 4) {
            var3 = new class146(this);
         } else if (var2 == 6) {
            var3 = new class153(this);
         } else if (var2 == 5) {
            var3 = new class138(this);
         } else if (var2 == 2) {
            var3 = new class143(this);
         } else if (var2 == 7) {
            var3 = new class136(this);
         } else if (var2 == 14) {
            var3 = new class140(this);
         } else if (var2 == 8) {
            var3 = new class157(this);
         } else if (var2 == 9) {
            var3 = new class163(this);
         } else if (var2 == 10) {
            var3 = new class149(this);
         } else if (var2 == 11) {
            var3 = new class144(this);
         } else if (var2 == 12) {
            var3 = new class148(this);
         } else {
            if (var2 != 15) {
               throw new RuntimeException("");
            }

            var3 = new class158(this);
         }

         ((class139)var3).vmethod3461(var1);
         this.field1658.addFirst((Node)var3);
      }

   }

   @ObfuscatedName("an")
   @ObfuscatedSignature(
      descriptor = "(Lfj;B)V",
      garbageValue = "-52"
   )
   public void method3225(ClanSettings var1) {
      if (this.field1661 == var1.field1729 && this.field1657 == var1.field1712) {
         for(class139 var2 = (class139)this.field1658.last(); var2 != null; var2 = (class139)this.field1658.previous()) {
            var2.vmethod3458(var1);
         }

         ++var1.field1712;
      } else {
         throw new RuntimeException("");
      }
   }

   @ObfuscatedName("al")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "6"
   )
   static int method3227() {
      return Rasterizer3D.field2514.field2802;
   }

   @ObfuscatedName("ji")
   @ObfuscatedSignature(
      descriptor = "(I)V",
      garbageValue = "1215119663"
   )
   static final void method3235() {
      for(Projectile var0 = (Projectile)Client.projectiles.last(); var0 != null; var0 = (Projectile)Client.projectiles.previous()) {
         if (var0.plane == GameEngine.Client_plane && Client.cycle <= var0.cycleEnd) {
            if (Client.cycle >= var0.cycleStart) {
               if (var0.targetIndex > 0) {
                  NPC var1 = Client.npcs[var0.targetIndex - 1];
                  if (var1 != null && var1.x >= 0 && var1.x < 13312 && var1.y >= 0 && var1.y < 13312) {
                     var0.setDestination(var1.x, var1.y, class147.getTileHeight(var1.x, var1.y, var0.plane) - var0.endHeight, Client.cycle);
                  }
               }

               if (var0.targetIndex < 0) {
                  int var2 = -var0.targetIndex - 1;
                  Player var3;
                  if (var2 == Client.localPlayerIndex) {
                     var3 = MusicPatchNode.localPlayer;
                  } else {
                     var3 = Client.players[var2];
                  }

                  if (var3 != null && var3.x >= 0 && var3.x < 13312 && var3.y >= 0 && var3.y < 13312) {
                     var0.setDestination(var3.x, var3.y, class147.getTileHeight(var3.x, var3.y, var0.plane) - var0.endHeight, Client.cycle);
                  }
               }

               var0.advance(Client.graphicsCycle);
               class31.scene.drawEntity(GameEngine.Client_plane, (int)var0.x, (int)var0.y, (int)var0.z, 60, var0, var0.yaw, -1L, false);
            }
         } else {
            var0.remove();
         }
      }

   }

   @ObfuscatedName("kg")
   @ObfuscatedSignature(
      descriptor = "(Ldf;B)V",
      garbageValue = "76"
   )
   static void method3236(NPC var0) {
      var0.field1140 = var0.definition.size;
      var0.field1190 = var0.definition.rotation;
      var0.walkSequence = var0.definition.walkSequence;
      var0.walkBackSequence = var0.definition.walkBackSequence;
      var0.walkLeftSequence = var0.definition.walkLeftSequence;
      var0.walkRightSequence = var0.definition.walkRightSequence;
      var0.idleSequence = var0.definition.idleSequence;
      var0.turnLeftSequence = var0.definition.turnLeftSequence;
      var0.turnRightSequence = var0.definition.turnRightSequence;
      var0.runSequence = var0.definition.field2048;
      var0.field1150 = var0.definition.field2008;
      var0.field1151 = var0.definition.field2025;
      var0.field1152 = var0.definition.field2037;
      var0.field1153 = var0.definition.field2023;
      var0.field1196 = var0.definition.field2028;
      var0.field1155 = var0.definition.field2029;
      var0.field1157 = var0.definition.field2030;
   }
}
