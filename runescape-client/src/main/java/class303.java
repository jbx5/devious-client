import net.runelite.mapping.ObfuscatedGetter;
import net.runelite.mapping.ObfuscatedName;
import net.runelite.mapping.ObfuscatedSignature;
import net.runelite.rs.ScriptOpcodes;

@ObfuscatedName("ku")
public class class303 {
	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static final class303 field3620;
	@ObfuscatedName("p")
	@ObfuscatedSignature(
		descriptor = "Lku;"
	)
	static final class303 field3619;
	@ObfuscatedName("f")
	@ObfuscatedGetter(
		intValue = 1203681901
	)
	final int field3621;
	@ObfuscatedName("n")
	@ObfuscatedGetter(
		intValue = -713827433
	)
	final int field3622;

	static {
		field3620 = new class303(51, 27, 800, 0, 16, 16); // L: 29
		field3619 = new class303(25, 28, 800, 656, 40, 40);
	}

	class303(int var1, int var2, int var3, int var4, int var5, int var6) {
		this.field3621 = var5; // L: 39
		this.field3622 = var6;
	}

	@ObfuscatedName("c")
	@ObfuscatedSignature(
		descriptor = "(B)V",
		garbageValue = "-125"
	)
	static void method5918() {
		for (ObjectSound var0 = (ObjectSound)ObjectSound.objectSounds.last(); var0 != null; var0 = (ObjectSound)ObjectSound.objectSounds.previous()) { // L: 30
			if (var0.stream1 != null) { // L: 31
				class16.pcmStreamMixer.removeSubStream(var0.stream1); // L: 32
				var0.stream1 = null; // L: 33
			}

			if (var0.stream2 != null) { // L: 35
				class16.pcmStreamMixer.removeSubStream(var0.stream2); // L: 36
				var0.stream2 = null; // L: 37
			}
		}

		ObjectSound.objectSounds.clear(); // L: 40
	} // L: 41

	@ObfuscatedName("ao")
	@ObfuscatedSignature(
		descriptor = "(ILbt;ZB)I",
		garbageValue = "-19"
	)
	static int method5917(int var0, Script var1, boolean var2) {
		if (var0 == ScriptOpcodes.FRIEND_COUNT) { // L: 2322
			if (Varps.friendSystem.field814 == 0) { // L: 2323
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -2;
			} else if (Varps.friendSystem.field814 == 1) { // L: 2324
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
			} else {
				Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.friendSystem.friendsList.getSize(); // L: 2325
			}

			return 1; // L: 2326
		} else {
			int var3;
			if (var0 == ScriptOpcodes.FRIEND_GETNAME) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2329
				if (Varps.friendSystem.method1784() && var3 >= 0 && var3 < Varps.friendSystem.friendsList.getSize()) { // L: 2330
					Friend var8 = (Friend)Varps.friendSystem.friendsList.get(var3); // L: 2331
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var8.getName(); // L: 2332
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var8.getPreviousName(); // L: 2333
				} else {
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 2336
					Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 2337
				}

				return 1; // L: 2339
			} else if (var0 == ScriptOpcodes.FRIEND_GETWORLD) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2342
				if (Varps.friendSystem.method1784() && var3 >= 0 && var3 < Varps.friendSystem.friendsList.getSize()) { // L: 2343
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Varps.friendSystem.friendsList.get(var3)).world; // L: 2344
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2346
				}

				return 1; // L: 2347
			} else if (var0 == ScriptOpcodes.FRIEND_GETRANK) {
				var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2350
				if (Varps.friendSystem.method1784() && var3 >= 0 && var3 < Varps.friendSystem.friendsList.getSize()) { // L: 2351
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)Varps.friendSystem.friendsList.get(var3)).rank; // L: 2352
				} else {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2354
				}

				return 1; // L: 2355
			} else {
				String var5;
				if (var0 == ScriptOpcodes.FRIEND_SETRANK) {
					var5 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 2358
					int var6 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2359
					class137.method3075(var5, var6); // L: 2360
					return 1; // L: 2361
				} else if (var0 == ScriptOpcodes.FRIEND_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 2364
					Varps.friendSystem.addFriend(var5); // L: 2365
					return 1; // L: 2366
				} else if (var0 == ScriptOpcodes.FRIEND_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 2369
					Varps.friendSystem.removeFriend(var5); // L: 2370
					return 1; // L: 2371
				} else if (var0 == ScriptOpcodes.IGNORE_ADD) {
					var5 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 2374
					Varps.friendSystem.addIgnore(var5); // L: 2375
					return 1; // L: 2376
				} else if (var0 == ScriptOpcodes.IGNORE_DEL) {
					var5 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 2379
					Varps.friendSystem.removeIgnore(var5); // L: 2380
					return 1; // L: 2381
				} else if (var0 == ScriptOpcodes.FRIEND_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 2384
					var5 = class14.method195(var5); // L: 2385
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.friendSystem.isFriended(new Username(var5, Players.loginType), false) ? 1 : 0; // L: 2386
					return 1; // L: 2387
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATDISPLAYNAME) {
					if (class145.friendsChat != null) { // L: 2390
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = class145.friendsChat.name; // L: 2391
					} else {
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 2393
					}

					return 1; // L: 2394
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATCOUNT) {
					if (class145.friendsChat != null) { // L: 2397
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class145.friendsChat.getSize(); // L: 2398
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2400
					}

					return 1; // L: 2401
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2404
					if (class145.friendsChat != null && var3 < class145.friendsChat.getSize()) { // L: 2405
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = class145.friendsChat.get(var3).getUsername().getName(); // L: 2406
					} else {
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 2408
					}

					return 1; // L: 2409
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERWORLD) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2412
					if (class145.friendsChat != null && var3 < class145.friendsChat.getSize()) { // L: 2413
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class145.friendsChat.get(var3)).getWorld(); // L: 2414
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2416
					}

					return 1; // L: 2417
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATUSERRANK) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2420
					if (class145.friendsChat != null && var3 < class145.friendsChat.getSize()) { // L: 2421
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = ((Buddy)class145.friendsChat.get(var3)).rank; // L: 2422
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2424
					}

					return 1; // L: 2425
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATMINKICK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class145.friendsChat != null ? class145.friendsChat.minKick : 0; // L: 2428
					return 1; // L: 2429
				} else if (var0 == ScriptOpcodes.CLAN_KICKUSER) {
					var5 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 2432
					class9.clanKickUser(var5); // L: 2433
					return 1; // L: 2434
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATRANK) {
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = class145.friendsChat != null ? class145.friendsChat.rank : 0; // L: 2437
					return 1; // L: 2438
				} else if (var0 == ScriptOpcodes.CLAN_JOINCHAT) {
					var5 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 2441
					class308.Clan_joinChat(var5); // L: 2442
					return 1; // L: 2443
				} else if (var0 == ScriptOpcodes.CLAN_LEAVECHAT) {
					class148.Clan_leaveChat(); // L: 2446
					return 1; // L: 2447
				} else if (var0 == ScriptOpcodes.IGNORE_COUNT) {
					if (!Varps.friendSystem.method1784()) { // L: 2450
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = -1;
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.friendSystem.ignoreList.getSize(); // L: 2451
					}

					return 1; // L: 2452
				} else if (var0 == ScriptOpcodes.IGNORE_GETNAME) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2455
					if (Varps.friendSystem.method1784() && var3 >= 0 && var3 < Varps.friendSystem.ignoreList.getSize()) { // L: 2456
						Ignored var4 = (Ignored)Varps.friendSystem.ignoreList.get(var3); // L: 2457
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4.getName(); // L: 2458
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = var4.getPreviousName(); // L: 2459
					} else {
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 2462
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 2463
					}

					return 1; // L: 2465
				} else if (var0 == ScriptOpcodes.IGNORE_TEST) {
					var5 = Interpreter.Interpreter_stringStack[--VarbitComposition.Interpreter_stringStackSize]; // L: 2468
					var5 = class14.method195(var5); // L: 2469
					Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = Varps.friendSystem.isIgnored(new Username(var5, Players.loginType)) ? 1 : 0; // L: 2470
					return 1; // L: 2471
				} else if (var0 == ScriptOpcodes.CLAN_ISSELF) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2474
					if (class145.friendsChat != null && var3 < class145.friendsChat.getSize() && class145.friendsChat.get(var3).getUsername().equals(class67.localPlayer.username)) { // L: 2475
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2476
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2478
					}

					return 1; // L: 2479
				} else if (var0 == ScriptOpcodes.CLAN_GETCHATOWNERNAME) {
					if (class145.friendsChat != null && class145.friendsChat.owner != null) { // L: 2482
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = class145.friendsChat.owner; // L: 2483
					} else {
						Interpreter.Interpreter_stringStack[++VarbitComposition.Interpreter_stringStackSize - 1] = ""; // L: 2485
					}

					return 1; // L: 2486
				} else if (var0 == ScriptOpcodes.CLAN_ISFRIEND) {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2489
					if (class145.friendsChat != null && var3 < class145.friendsChat.getSize() && ((ClanMate)class145.friendsChat.get(var3)).isFriend()) { // L: 2490
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2491
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2493
					}

					return 1; // L: 2494
				} else if (var0 != ScriptOpcodes.CLAN_ISIGNORE) {
					if (var0 == 3628) {
						Varps.friendSystem.friendsList.removeComparator(); // L: 2505
						return 1; // L: 2506
					} else {
						boolean var7;
						if (var0 == 3629) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2509
							Varps.friendSystem.friendsList.addComparator(new UserComparator1(var7)); // L: 2510
							return 1; // L: 2511
						} else if (var0 == 3630) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2514
							Varps.friendSystem.friendsList.addComparator(new UserComparator2(var7)); // L: 2515
							return 1; // L: 2516
						} else if (var0 == 3631) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2519
							Varps.friendSystem.friendsList.addComparator(new UserComparator3(var7)); // L: 2520
							return 1; // L: 2521
						} else if (var0 == 3632) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2524
							Varps.friendSystem.friendsList.addComparator(new UserComparator4(var7)); // L: 2525
							return 1; // L: 2526
						} else if (var0 == 3633) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2529
							Varps.friendSystem.friendsList.addComparator(new UserComparator5(var7)); // L: 2530
							return 1; // L: 2531
						} else if (var0 == 3634) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2534
							Varps.friendSystem.friendsList.addComparator(new UserComparator6(var7)); // L: 2535
							return 1; // L: 2536
						} else if (var0 == 3635) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2539
							Varps.friendSystem.friendsList.addComparator(new UserComparator7(var7)); // L: 2540
							return 1; // L: 2541
						} else if (var0 == 3636) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2544
							Varps.friendSystem.friendsList.addComparator(new UserComparator8(var7)); // L: 2545
							return 1; // L: 2546
						} else if (var0 == 3637) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2549
							Varps.friendSystem.friendsList.addComparator(new UserComparator9(var7)); // L: 2550
							return 1; // L: 2551
						} else if (var0 == 3638) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2554
							Varps.friendSystem.friendsList.addComparator(new UserComparator10(var7)); // L: 2555
							return 1; // L: 2556
						} else if (var0 == 3639) {
							Varps.friendSystem.friendsList.sort(); // L: 2559
							return 1; // L: 2560
						} else if (var0 == 3640) {
							Varps.friendSystem.ignoreList.removeComparator(); // L: 2563
							return 1; // L: 2564
						} else if (var0 == 3641) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2567
							Varps.friendSystem.ignoreList.addComparator(new UserComparator1(var7)); // L: 2568
							return 1; // L: 2569
						} else if (var0 == 3642) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2572
							Varps.friendSystem.ignoreList.addComparator(new UserComparator2(var7)); // L: 2573
							return 1; // L: 2574
						} else if (var0 == 3643) {
							Varps.friendSystem.ignoreList.sort(); // L: 2577
							return 1; // L: 2578
						} else if (var0 == 3644) {
							if (class145.friendsChat != null) { // L: 2581
								class145.friendsChat.removeComparator(); // L: 2582
							}

							return 1; // L: 2584
						} else if (var0 == 3645) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2587
							if (class145.friendsChat != null) { // L: 2588
								class145.friendsChat.addComparator(new UserComparator1(var7)); // L: 2589
							}

							return 1; // L: 2591
						} else if (var0 == 3646) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2594
							if (class145.friendsChat != null) { // L: 2595
								class145.friendsChat.addComparator(new UserComparator2(var7)); // L: 2596
							}

							return 1; // L: 2598
						} else if (var0 == 3647) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2601
							if (class145.friendsChat != null) { // L: 2602
								class145.friendsChat.addComparator(new UserComparator3(var7)); // L: 2603
							}

							return 1; // L: 2605
						} else if (var0 == 3648) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2608
							if (class145.friendsChat != null) { // L: 2609
								class145.friendsChat.addComparator(new UserComparator4(var7)); // L: 2610
							}

							return 1; // L: 2612
						} else if (var0 == 3649) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2615
							if (class145.friendsChat != null) { // L: 2616
								class145.friendsChat.addComparator(new UserComparator5(var7)); // L: 2617
							}

							return 1; // L: 2619
						} else if (var0 == 3650) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2622
							if (class145.friendsChat != null) { // L: 2623
								class145.friendsChat.addComparator(new UserComparator6(var7)); // L: 2624
							}

							return 1; // L: 2626
						} else if (var0 == 3651) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2629
							if (class145.friendsChat != null) { // L: 2630
								class145.friendsChat.addComparator(new UserComparator7(var7)); // L: 2631
							}

							return 1; // L: 2633
						} else if (var0 == 3652) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2636
							if (class145.friendsChat != null) { // L: 2637
								class145.friendsChat.addComparator(new UserComparator8(var7)); // L: 2638
							}

							return 1; // L: 2640
						} else if (var0 == 3653) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2643
							if (class145.friendsChat != null) { // L: 2644
								class145.friendsChat.addComparator(new UserComparator9(var7)); // L: 2645
							}

							return 1; // L: 2647
						} else if (var0 == 3654) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2650
							if (class145.friendsChat != null) { // L: 2651
								class145.friendsChat.addComparator(new UserComparator10(var7)); // L: 2652
							}

							return 1; // L: 2654
						} else if (var0 == 3655) {
							if (class145.friendsChat != null) { // L: 2657
								class145.friendsChat.sort(); // L: 2658
							}

							return 1; // L: 2660
						} else if (var0 == 3656) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2663
							Varps.friendSystem.friendsList.addComparator(new BuddyRankComparator(var7)); // L: 2664
							return 1; // L: 2665
						} else if (var0 == 3657) {
							var7 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize] == 1; // L: 2668
							if (class145.friendsChat != null) { // L: 2669
								class145.friendsChat.addComparator(new BuddyRankComparator(var7)); // L: 2670
							}

							return 1; // L: 2672
						} else {
							return 2; // L: 2674
						}
					}
				} else {
					var3 = Interpreter.Interpreter_intStack[--Interpreter.Interpreter_intStackSize]; // L: 2497
					if (class145.friendsChat != null && var3 < class145.friendsChat.getSize() && ((ClanMate)class145.friendsChat.get(var3)).isIgnored()) { // L: 2498
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 1; // L: 2499
					} else {
						Interpreter.Interpreter_intStack[++Interpreter.Interpreter_intStackSize - 1] = 0; // L: 2501
					}

					return 1; // L: 2502
				}
			}
		}
	}
}
