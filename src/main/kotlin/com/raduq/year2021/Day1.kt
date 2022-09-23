
fun main() {
  println(part2())
}

fun part1(): Int {
  val result = list.foldIndexed(initial = 0) { index, acc, cur ->
    val past: Int = if (index > 0) list[index - 1] else 0
    if (index != 0 && cur > past) acc + 1 else acc
  }
  return result
}

fun part2(): Int {
  return list
    .windowed(size = 3, partialWindows = false)
    .map { l -> l.sum() }
    .zipWithNext().count { (a, b) -> b > a }
}

val list = """191
  185
  188
  189
  204
  213
  215
  227
  222
  221
  236
  235
  236
  232
  224
  228
  234
  226
  227
  228
  230
  232
  234
  213
  197
  198
  210
  238
  248
  261
  263
  265
  262
  295
  296
  311
  330
  333
  337
  344
  345
  356
  359
  360
  364
  367
  383
  386
  387
  391
  424
  426
  428
  440
  442
  446
  450
  423
  428
  423
  425
  445
  429
  436
  465
  456
  463
  461
  463
  483
  484
  500
  517
  525
  529
  527
  530
  535
  566
  578
  582
  587
  604
  613
  614
  609
  611
  619
  623
  627
  621
  622
  626
  644
  646
  655
  657
  659
  661
  671
  673
  668
  673
  676
  682
  683
  678
  679
  682
  681
  684
  686
  690
  693
  698
  700
  702
  707
  708
  732
  733
  734
  743
  745
  776
  794
  804
  784
  790
  813
  856
  855
  859
  850
  851
  886
  885
  888
  889
  883
  885
  920
  919
  917
  915
  918
  909
  910
  924
  925
  932
  933
  935
  966
  970
  971
  974
  958
  959
  961
  959
  964
  969
  970
  973
  972
  976
  998
  1009
  1010
  1011
  1046
  1047
  1040
  1041
  1056
  1062
  1061
  1062
  1077
  1078
  1080
  1082
  1094
  1096
  1097
  1103
  1128
  1125
  1167
  1176
  1175
  1173
  1183
  1182
  1183
  1188
  1202
  1204
  1205
  1206
  1207
  1212
  1235
  1236
  1256
  1268
  1270
  1276
  1281
  1283
  1276
  1287
  1292
  1295
  1291
  1297
  1298
  1301
  1312
  1316
  1333
  1327
  1340
  1338
  1348
  1364
  1381
  1382
  1383
  1394
  1385
  1388
  1387
  1388
  1394
  1398
  1400
  1397
  1399
  1401
  1408
  1410
  1420
  1421
  1434
  1433
  1436
  1456
  1455
  1479
  1482
  1483
  1522
  1526
  1527
  1542
  1543
  1544
  1548
  1557
  1571
  1574
  1580
  1579
  1602
  1618
  1605
  1608
  1612
  1622
  1625
  1626
  1633
  1648
  1641
  1643
  1650
  1652
  1659
  1678
  1681
  1688
  1692
  1702
  1686
  1688
  1685
  1684
  1674
  1694
  1696
  1695
  1720
  1729
  1736
  1762
  1763
  1767
  1780
  1789
  1796
  1798
  1799
  1800
  1808
  1800
  1805
  1848
  1849
  1867
  1888
  1902
  1903
  1920
  1923
  1926
  1930
  1933
  1925
  1906
  1878
  1898
  1899
  1930
  1936
  1948
  1974
  1983
  1984
  1986
  1983
  1984
  1987
  1985
  1988
  1992
  2005
  2009
  2013
  2025
  2033
  2043
  2046
  2030
  2014
  2009
  2011
  2013
  2043
  2049
  2053
  2065
  2070
  2079
  2080
  2090
  2092
  2102
  2116
  2138
  2140
  2141
  2143
  2149
  2152
  2153
  2154
  2170
  2194
  2192
  2216
  2231
  2246
  2261
  2268
  2269
  2252
  2260
  2264
  2274
  2289
  2293
  2296
  2297
  2300
  2305
  2334
  2329
  2353
  2357
  2359
  2364
  2374
  2377
  2364
  2365
  2366
  2360
  2362
  2360
  2361
  2367
  2357
  2362
  2376
  2379
  2380
  2381
  2401
  2436
  2435
  2439
  2446
  2454
  2456
  2459
  2492
  2493
  2514
  2519
  2524
  2529
  2530
  2535
  2548
  2549
  2551
  2548
  2553
  2552
  2556
  2563
  2570
  2603
  2616
  2617
  2623
  2630
  2631
  2641
  2645
  2660
  2662
  2663
  2664
  2662
  2668
  2673
  2677
  2687
  2688
  2699
  2698
  2691
  2695
  2696
  2710
  2711
  2717
  2722
  2723
  2747
  2746
  2754
  2753
  2752
  2771
  2773
  2774
  2777
  2789
  2790
  2805
  2807
  2818
  2817
  2825
  2818
  2828
  2833
  2834
  2837
  2839
  2854
  2856
  2858
  2859
  2863
  2880
  2882
  2884
  2887
  2888
  2889
  2902
  2911
  2917
  2936
  2938
  2940
  2943
  2944
  2943
  2947
  2954
  2956
  2957
  2959
  2957
  2958
  2959
  2956
  2959
  2960
  2969
  2974
  2979
  2983
  2985
  2986
  2992
  2993
  2995
  3025
  3037
  3036
  3037
  3038
  3040
  3043
  3049
  3058
  3071
  3072
  3080
  3083
  3081
  3090
  3091
  3070
  3076
  3079
  3083
  3084
  3086
  3101
  3114
  3106
  3107
  3137
  3138
  3139
  3137
  3133
  3137
  3102
  3108
  3109
  3124
  3130
  3138
  3149
  3150
  3160
  3171
  3191
  3190
  3200
  3205
  3229
  3235
  3237
  3238
  3239
  3243
  3244
  3245
  3246
  3250
  3265
  3268
  3269
  3271
  3279
  3278
  3279
  3280
  3281
  3290
  3295
  3296
  3300
  3303
  3304
  3305
  3308
  3325
  3313
  3326
  3327
  3335
  3336
  3337
  3335
  3361
  3378
  3374
  3378
  3387
  3406
  3416
  3418
  3438
  3454
  3460
  3475
  3476
  3477
  3471
  3476
  3477
  3486
  3487
  3500
  3502
  3503
  3530
  3531
  3530
  3556
  3563
  3564
  3565
  3566
  3580
  3587
  3591
  3598
  3599
  3612
  3613
  3624
  3623
  3631
  3660
  3661
  3662
  3668
  3671
  3672
  3674
  3683
  3684
  3693
  3694
  3700
  3696
  3699
  3705
  3706
  3710
  3717
  3731
  3734
  3729
  3735
  3736
  3739
  3749
  3734
  3739
  3742
  3753
  3756
  3757
  3775
  3777
  3774
  3780
  3785
  3786
  3790
  3792
  3796
  3798
  3802
  3817
  3818
  3815
  3822
  3824
  3849
  3856
  3871
  3845
  3847
  3849
  3851
  3853
  3884
  3885
  3887
  3889
  3891
  3894
  3895
  3900
  3918
  3935
  3936
  3941
  3945
  3936
  3942
  3945
  3942
  3943
  3965
  3974
  3976
  3979
  3975
  3976
  3980
  3993
  3992
  3991
  3999
  4000
  3996
  4019
  4028
  4029
  4031
  4053
  4054
  4080
  4087
  4089
  4088
  4098
  4100
  4103
  4104
  4112
  4125
  4145
  4148
  4152
  4153
  4158
  4162
  4165
  4177
  4184
  4203
  4205
  4206
  4207
  4211
  4215
  4221
  4240
  4247
  4253
  4261
  4262
  4265
  4269
  4273
  4274
  4258
  4260
  4264
  4282
  4299
  4313
  4284
  4287
  4289
  4290
  4293
  4295
  4297
  4296
  4310
  4314
  4313
  4327
  4329
  4330
  4328
  4338
  4347
  4368
  4371
  4373
  4379
  4388
  4392
  4396
  4393
  4394
  4393
  4397
  4406
  4409
  4410
  4414
  4437
  4436
  4428
  4429
  4434
  4426
  4427
  4428
  4445
  4447
  4467
  4471
  4470
  4472
  4485
  4487
  4493
  4495
  4491
  4497
  4500
  4506
  4507
  4508
  4511
  4518
  4519
  4523
  4520
  4523
  4540
  4541
  4548
  4549
  4550
  4551
  4560
  4570
  4586
  4575
  4581
  4585
  4586
  4591
  4601
  4595
  4597
  4601
  4613
  4615
  4617
  4619
  4604
  4609
  4610
  4616
  4640
  4666
  4676
  4677
  4678
  4709
  4704
  4719
  4727
  4729
  4730
  4747
  4753
  4755
  4768
  4770
  4772
  4777
  4781
  4811
  4814
  4843
  4844
  4846
  4850
  4862
  4863
  4868
  4869
  4870
  4871
  4874
  4881
  4882
  4878
  4887
  4895
  4898
  4910
  4920
  4908
  4910
  4909
  4914
  4916
  4922
  4914
  4918
  4926
  4949
  4952
  4953
  4955
  4956
  4959
  4985
  4986
  4990
  4992
  5028
  5029
  5032
  5030
  5037
  5038
  5047
  5053
  5054
  5059
  5057
  5059
  5062
  5067
  5085
  5086
  5090
  5084
  5077
  5078
  5081
  5091
  5094
  5096
  5095
  5097
  5103
  5118
  5144
  5146
  5153
  5160
  5169
  5173
  5174
  5175
  5184
  5187
  5195
  5196
  5216
  5225
  5238
  5239
  5232
  5235
  5237
  5242
  5244
  5247
  5254
  5262
  5271
  5281
  5287
  5288
  5260
  5264
  5282
  5295
  5301
  5304
  5310
  5295
  5296
  5297
  5298
  5303
  5304
  5305
  5277
  5278
  5289
  5295
  5290
  5297
  5299
  5320
  5328
  5341
  5347
  5356
  5361
  5364
  5365
  5378
  5379
  5377
  5378
  5367
  5380
  5381
  5387
  5385
  5390
  5391
  5392
  5415
  5422
  5423
  5425
  5439
  5441
  5448
  5455
  5470
  5477
  5482
  5488
  5489
  5492
  5501
  5499
  5496
  5499
  5533
  5552
  5562
  5563
  5565
  5566
  5572
  5571
  5581
  5583
  5589
  5594
  5593
  5596
  5602
  5606
  5629
  5643
  5644
  5652
  5673
  5676
  5680
  5676
  5681
  5696
  5703
  5698
  5718
  5720
  5733
  5736
  5741
  5766
  5771
  5786
  5787
  5793
  5790
  5786
  5804
  5805
  5808
  5809
  5816
  5810
  5811
  5818
  5829
  5836
  5839
  5824
  5839
  5843
  5845
  5849
  5853
  5856
  5861
  5873
  5894
  5895
  5896
  5897
  5898
  5899
  5900
  5913
  5917
  5918
  5923
  5924
  5934
  5935
  5952
  5965
  5963
  5958
  5961
  5975
  5988
  5989
  5996
  5997
  6008
  6011
  6023
  6024
  6033
  6048
  6050
  6051
  6049
  6048
  6043
  6048
  6051
  6055
  6081
  6084
  6087
  6093
  6092
  6090
  6078
  6079
  6103
  6092
  6094
  6099
  6100
  6116
  6123
  6129
  6127
  6138
  6139
  6141
  6143
  6146
  6147
  6159
  6162
  6163
  6177
  6179
  6183
  6187
  6188
  6194
  6198
  6213
  6237
  6267
  6282
  6288
  6292
  6297
  6310
  6323
  6325
  6324
  6347
  6349
  6350
  6353
  6363
  6376
  6384
  6394
  6397
  6401
  6402
  6399
  6415
  6416
  6421
  6422
  6423
  6420
  6445
  6446
  6449
  6451
  6457
  6460
  6461
  6467
  6468
  6473
  6474
  6517
  6522
  6519
  6515
  6532
  6533
  6535
  6530
  6532
  6522
  6548
  6549
  6565
  6568
  6579
  6556
  6563
  6565
  6572
  6576
  6578
  6601
  6608
  6611
  6612
  6626
  6619
  6651
  6657
  6658
  6666
  6665
  6660
  6682
  6704
  6705
  6711
  6708
  6716
  6720
  6725
  6727
  6729
  6733
  6734
  6737
  6736
  6741
  6742
  6743
  6750
  6756
  6757
  6758
  6755
  6774
  6773
  6774
  6780
  6781
  6790
  6791
  6800
  6812
  6815
  6817
  6827
  6826
  6832
  6833
  6834
  6833
  6822
  6825
  6829
  6836
  6840
  6846
  6850
  6861
  6868
  6869
  6872
  6879
  6882
  6884
  6907
  6917
  6930
  6924
  6934
  6931
  6918
  6924
  6928
  6934
  6935
  6936
  6953
  6955
  6964
  6987
  6999
  7009
  7042
  7048
  7027
  7054
  7053
  7072
  7073
  7055
  7056
  7057
  7079
  7080
  7084
  7095
  7108
  7107
  7109
  7111
  7134
  7135
  7137
  7138
  7145
  7151
  7161
  7172
  7179
  7183
  7189
  7188
  7189
  7195
  7202
  7236
  7241
  7250
  7277
  7295
  7297
  7294
  7298
  7297
  7301
  7289
  7291
  7276
  7293
  7295
  7311
  7318
  7341
  7378
  7398
  7408
  7409
  7412
  7409
  7413
  7397
  7399
  7423
  7424
  7423
  7426
  7418
  7414
  7409
  7412
  7425
  7426
  7433
  7439
  7448
  7462
  7466
  7467
  7468
  7477
  7480
  7481
  7498
  7499
  7501
  7507
  7527
  7535
  7548
  7551
  7552
  7555
  7561
  7554
  7559
  7560
  7587
  7590
  7596
  7620
  7628
  7645
  7646
  7652
  7653
  7654
  7663
  7670
  7678
  7683
  7686
  7687
  7683
  7692
  7691
  7687
  7688
  7691
  7699
  7698
  7725
  7733
  7734
  7736
  7740
  7751
  7744
  7724
  7719
  7729
  7731
  7746
  7747
  7749
  7722
  7725
  7730
  7735
  7737
  7738
  7739
  7724
  7721
  7724
  7736
  7727
  7730
  7731
  7732
  7736
  7737
  7768
  7787
  7797
  7807
  7815
  7819
  7825
  7852
  7856
  7862
  7869
  7881
  7882
  7885
  7888
  7892
  7889
  7893
  7895
  7896
  7901
  7919
  7921
  7932
  7933
  7964
  7979
  7990
  7991
  7994
  7997
  8011
  8005
  8006
  8014
  8047
  8049
  8064
  8065
  8046
  8047
  8079
  8081
  8082
  8083
  8055
  8052
  8056
  8063
  8064
  8066
  8053
  8067
  8072
  8073
  8077
  8079
  8081
  8076
  8083
  8086
  8098
  8100
  8109
  8107
  8124
  8125
  8126
  8127
  8145
  8146
  8152
  8175
  8176
  8177
  8182
  8193
  8195
  8197
  8199
  8203
  8204
  8213
  8217
  8237
  8240
  8239
  8230
  8237
  8245
  8259
  8264
  8272
  8288
  8285
  8286
  8300
  8301
  8304
  8305
  8327
  8326
  8327
  8341
  8343
  8356
  8357
  8358
  8367
  8374
  8375
  8391
  8392
  8393
  8394
  8399
  8405
  8402
  8404
  8435
  8444
  8484
  8481
  8490
  8492
  8493
  8494
  8503
  8506
  8516
  8515
  8516
  8504
  8508
  8513
  8529
  8542
  8545
  8541
  8546
  8549
  8570
  8552
  8553
  8581
  8578
  8585
  8593
  8596
  8605
  8606
  8608
  8616
  8627
  8628
  8627
  8639
  8644
  8645
  8626
  8633
  8635
  8636
  8640
  8645
  8655
  8673
  8693
  8694
  8695
  8696
  8695
  8714
  8716
  8742
  8739
  8735
  8740
  8763
  8762
  8771
  8772
  8777
  8776
  8787
  8788
  8795
  8796
  8777
  8782
  8783
  8794
  8800
  8810
  8827
  8828
  8833
  8829
  8841
  8862
  8865
  8867
  8869
  8895
  8899
  8901
  8904
  8908
  8909
  8927
  8928
  8930
  8931
  8935
  8945
  8946
  8950
  8954
  8957
  8959
  8949
  8961
  8976
  8980
  8986
  8988
  8992
  9003
  9008
  9009
  9029
  9050
  9051
  9054
  9055
  9068
  9054
  9071
  9082
  9087
  9089
  9112
  9113
  9127
  9126
  9125
  9129
  9138
  9140
  9145
  9149
  9151
  9179
  9185
  9187
  9188
  9189
  9186
  9190
  9207
  9208
  9209
  9221
  9228
  9252
  9254
  9264
  9267
  9276
  9287
  9293
  9292
  9260
  9261
  9260
  9265
  9266
  9285
  9287
  9289
  9290
  9291
  9292
  9293
  9295
  9313
  9314
  9291
  9282
  9304
  9315
  9316
  9317
  9327
  9345
  9350
  9352
  9356
  9366
  9367
  9400
  9407
  9408
  9415
  9418
  9419
  9432
  9441
  9442
  9439
  9440
  9451
  9455
  9464
  9472
  9479
  9481
  9490
  9514
  9527
  9546
  9552
  9556
  9570
  9582
  9584
  9592
  9597
  9602
  9618
  9619
  9622
  9639
  9645
  9648
  9643
  9647
  9648
  9650
  9641
  9665
  9678
  9681
  9682
  9683
  9692
  9703
  9704
  9702
  9704
  9712
  9726
  9731
  9732
  9733
  9744
  9745
  9757
  9755
  9763
  9764
  9766
  9768
  9782
  9780
  9781
  9783
  9786
  9803
  9804
  9821
  9822
  9840
  9841
  9843
  9839
  9840
  9846
  9856
  9859
  9863
  9862
  9864
  9865
  9866
  9870
  9878
  9877
  9894
  9896
  9937
  9938
  9943
  9944
  9943
  9952
  9962
  9983
  9985
  9984
  9992
  10002
  10003
  10041
  10040
  10041
  10040
  10042
  10029
  10034
  10033
  10034
  10052
  10053
  10062
  10055
  10056
  10057
  10069
  10073
  10067
  10070
  10065
  10064
  10069
  10071
  10092
  10069
  10070
  10080
  10095
  10099
  10100
  10101
  10099
  10115
  10116
  10117
  10122
  10124
  10129
  10096
  10101
  10106
  10099
  10102
  10143
  10144
  10145
  10146
  10148
  10149
  10150
  10160
  10132
  10137
  10177
  10181
  10178
  10183
  10189
  10191
  10192
  10194
  10203
  10199
  10207
  10218
  10223
  10224
  10225
  10245
  10239
  10247
  10252
  10250
  10254
  10255
  10256
  10279
  10280
  10292
  10293
  10300
  10310
  10312
  10321
  10324
  10326
  10330
  10329
  10328
  10329
  10333
  10355
  10354
  10349
  10352
  10357
  10369
  10386
  10387
  10402
  10406
  10407
  10404
  10405
  10407
  10408
  10412
  10413
  10417
  10420
  10412
  10426
  10427
  10424
  10433
  10434
  10435
  10456
  10472
  10492
  10494
  10508
  10510
  10511
  10512
  10513
  10514
  10507
  10510
  10511
  10515
  10525
  10526
""".trimIndent().lines().map { it.trim().toInt() }
