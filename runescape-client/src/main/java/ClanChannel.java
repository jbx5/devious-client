import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import net.runelite.mapping.Export;
import net.runelite.mapping.Implements;
import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;

@ObfuscatedName("eq")
@Implements("ClanChannel")
public class ClanChannel extends Node {
   @ObfuscatedName("fe")
   @ObfuscatedSignature(
      descriptor = "Llx;"
   )
   @Export("archive15")
   static Archive archive15;
   @ObfuscatedName("gf")
   @Export("secureRandom")
   static SecureRandom secureRandom;
   @ObfuscatedName("a")
   boolean field1733;
   @ObfuscatedName("f")
   boolean field1726 = true;
   @ObfuscatedName("c")
   @Export("members")
   public List members;
   @ObfuscatedName("x")
   @Export("sortedMembers")
   int[] sortedMembers;
   @ObfuscatedName("h")
   @ObfuscatedGetter(
      longValue = 5837324716247821387L
   )
   long field1729;
   @ObfuscatedName("j")
   @Export("name")
   public String name = null;
   @ObfuscatedName("y")
   public byte field1725;
   @ObfuscatedName("d")
   public byte field1731;

   static {
      new BitSet(65536);
   }

   @ObfuscatedSignature(
      descriptor = "(Lqr;)V"
   )
   public ClanChannel(Buffer var1) {
      this.method3209(var1);
   }

   @ObfuscatedName("a")
   @ObfuscatedSignature(
      descriptor = "(B)[I",
      garbageValue = "-16"
   )
   @Export("getSortedMembers")
   public int[] getSortedMembers() {
      if (this.sortedMembers == null) {
         String[] var1 = new String[this.members.size()];
         this.sortedMembers = new int[this.members.size()];

         for(int var2 = 0; var2 < this.members.size(); this.sortedMembers[var2] = var2++) {
            var1[var2] = ((ClanChannelMember)this.members.get(var2)).username.method8997();
         }

         TileItem.method2554(var1, this.sortedMembers);
      }

      return this.sortedMembers;
   }

   @ObfuscatedName("f")
   @ObfuscatedSignature(
      descriptor = "(Lec;I)V",
      garbageValue = "823088173"
   )
   @Export("addMember")
   void addMember(ClanChannelMember var1) {
      this.members.add(var1);
      this.sortedMembers = null;
   }

   @ObfuscatedName("c")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "99729277"
   )
   @Export("removeMember")
   void removeMember(int var1) {
      this.members.remove(var1);
      this.sortedMembers = null;
   }

   @ObfuscatedName("x")
   @ObfuscatedSignature(
      descriptor = "(B)I",
      garbageValue = "36"
   )
   public int method3215() {
      return this.members.size();
   }

   @ObfuscatedName("h")
   @ObfuscatedSignature(
      descriptor = "(Ljava/lang/String;I)I",
      garbageValue = "971753480"
   )
   public int method3208(String var1) {
      if (!this.field1726) {
         throw new RuntimeException("Displaynames not available");
      } else {
         for(int var2 = 0; var2 < this.members.size(); ++var2) {
            if (((ClanChannelMember)this.members.get(var2)).username.getName().equalsIgnoreCase(var1)) {
               return var2;
            }
         }

         return -1;
      }
   }

   @ObfuscatedName("j")
   @ObfuscatedSignature(
      descriptor = "(Lqr;B)V",
      garbageValue = "0"
   )
   void method3209(Buffer var1) {
      int var2 = var1.readUnsignedByte();
      if ((var2 & 1) != 0) {
         this.field1733 = true;
      }

      if ((var2 & 2) != 0) {
         this.field1726 = true;
      }

      int var3 = 2;
      if ((var2 & 4) != 0) {
         var3 = var1.readUnsignedByte();
      }

      super.key = var1.readLong();
      this.field1729 = var1.readLong();
      this.name = var1.readStringCp1252NullTerminated();
      var1.readBoolean();
      this.field1731 = var1.readByte();
      this.field1725 = var1.readByte();
      int var4 = var1.readUnsignedShort();
      if (var4 > 0) {
         this.members = new ArrayList(var4);

         for(int var5 = 0; var5 < var4; ++var5) {
            ClanChannelMember var6 = new ClanChannelMember();
            if (this.field1733) {
               var1.readLong();
            }

            if (this.field1726) {
               var6.username = new Username(var1.readStringCp1252NullTerminated());
            }

            var6.rank = var1.readByte();
            var6.world = var1.readUnsignedShort();
            if (var3 >= 3) {
               var1.readBoolean();
            }

            this.members.add(var5, var6);
         }
      }

   }

   @ObfuscatedName("li")
   @ObfuscatedSignature(
      descriptor = "(II)V",
      garbageValue = "1457219972"
   )
   @Export("changeGameOptions")
   static final void changeGameOptions(int var0) {
      ItemComposition.method3786();
      World.method1765();
      int var1 = ClientPacket.VarpDefinition_get(var0).type;
      if (var1 != 0) {
         int var2 = Varps.Varps_main[var0];
         if (var1 == 1) {
            if (var2 == 1) {
               FloorDecoration.method4134(0.9);
            }

            if (var2 == 2) {
               FloorDecoration.method4134(0.8);
            }

            if (var2 == 3) {
               FloorDecoration.method4134(0.7);
            }

            if (var2 == 4) {
               FloorDecoration.method4134(0.6);
            }
         }

         if (var1 == 3) {
            if (var2 == 0) {
               class20.method288(255);
            }

            if (var2 == 1) {
               class20.method288(192);
            }

            if (var2 == 2) {
               class20.method288(128);
            }

            if (var2 == 3) {
               class20.method288(64);
            }

            if (var2 == 4) {
               class20.method288(0);
            }
         }

         if (var1 == 4) {
            if (var2 == 0) {
               Message.method1150(127);
            }

            if (var2 == 1) {
               Message.method1150(96);
            }

            if (var2 == 2) {
               Message.method1150(64);
            }

            if (var2 == 3) {
               Message.method1150(32);
            }

            if (var2 == 4) {
               Message.method1150(0);
            }
         }

         if (var1 == 5) {
            Client.leftClickOpensMenu = var2 == 1;
         }

         if (var1 == 6) {
            Client.chatEffects = var2;
         }

         if (var1 == 9) {
            Client.field671 = var2;
         }

         if (var1 == 10) {
            if (var2 == 0) {
               Calendar.method6226(127);
            }

            if (var2 == 1) {
               Calendar.method6226(96);
            }

            if (var2 == 2) {
               Calendar.method6226(64);
            }

            if (var2 == 3) {
               Calendar.method6226(32);
            }

            if (var2 == 4) {
               Calendar.method6226(0);
            }
         }

         if (var1 == 17) {
            Client.followerIndex = var2 & '\uffff';
         }

         if (var1 == 18) {
            Client.playerAttackOption = (AttackOption)WallDecoration.findEnumerated(FriendSystem.method1778(), var2);
            if (Client.playerAttackOption == null) {
               Client.playerAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

         if (var1 == 19) {
            if (var2 == -1) {
               Client.combatTargetPlayerIndex = -1;
            } else {
               Client.combatTargetPlayerIndex = var2 & 2047;
            }
         }

         if (var1 == 22) {
            Client.npcAttackOption = (AttackOption)WallDecoration.findEnumerated(FriendSystem.method1778(), var2);
            if (Client.npcAttackOption == null) {
               Client.npcAttackOption = AttackOption.AttackOption_dependsOnCombatLevels;
            }
         }

      }
   }
}
