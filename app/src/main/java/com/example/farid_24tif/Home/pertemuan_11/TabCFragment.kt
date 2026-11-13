package com.example.farid_24tif.Home.pertemuan_11

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.example.farid_24tif.R
import com.example.farid_24tif.databinding.FragmentMoreBinding
import com.example.farid_24tif.databinding.FragmentTabCBinding


class TabCFragment : Fragment() {
    private var _binding: FragmentTabCBinding? = null
    private val binding get() = _binding!!

    private val productList = listOf(
        ProductModel("Sepatu Running Nike", "Rp 850.000", "https://images.unsplash.com/photo-1542291026-7eec264c27ff?w=400&q=80"),
        ProductModel("Kemeja Flannel", "Rp 320.000", "https://images.unsplash.com/photo-1596755094514-f87e34085b2c?w=400&q=80"),
        ProductModel("Tas Ransel Laptop", "Rp 450.000", "https://images.unsplash.com/photo-1553062407-98eeb64c6a62?w=400&q=80"),
        ProductModel("Jam Tangan Casio", "Rp 1.200.000", "https://images.unsplash.com/photo-1523275335684-37898b6baf30?w=400&q=80"),
        ProductModel("Headphone Sony", "Rp 1.500.000", "https://images.unsplash.com/photo-1505740420928-5e560c06d30e?w=400&q=80"),
        ProductModel("Kaos Polos Premium", "Rp 150.000", "https://images.unsplash.com/photo-1521572163474-6864f9cf17ab?w=400&q=80"),
        ProductModel("Celana Jogger", "Rp 280.000", "https://images.unsplash.com/photo-1552902865-b72c031ac5ea?w=400&q=80"),
        ProductModel("Sneakers Adidas", "Rp 950.000", "https://images.unsplash.com/photo-1518002171953-a080ee817e1f?w=400&q=80"),
        ProductModel("Dompet Kulit", "Rp 220.000", "https://images.unsplash.com/photo-1627123424574-724758594e93?w=400&q=80"),
        ProductModel("Topi Baseball", "Rp 120.000", "https://images.unsplash.com/photo-1588850561407-ed78c282e89b?w=400&q=80"),


        ProductModel("Mouse Gaming RGB", "Rp 275.000", "https://images.unsplash.com/photo-1527814050087-3793815479db?w=400&q=80"),
        ProductModel("Keyboard Mechanical", "Rp 780.000", "https://images.unsplash.com/photo-1595225476474-87563907a212?w=400&q=80"),
        ProductModel("Monitor LG 24 Inch", "Rp 2.100.000", "https://images.unsplash.com/photo-1527443224154-c4a3942d3acf?w=400&q=80"),
        ProductModel("Power Bank 20000mAh", "Rp 350.000", "https://images.unsplash.com/photo-1609091839311-d5365f9ff1c5?w=400&q=80"),
        ProductModel("Charger Fast Charging", "Rp 180.000", "https://images.unsplash.com/photo-1583863788434-e58a36330cf0?w=400&q=80"),
        ProductModel("Kacamata Hitam", "Rp 260.000", "https://images.unsplash.com/photo-1511499767150-a48a237f0083?w=400&q=80"),
        ProductModel("Sandal Gunung", "Rp 340.000", "https://images.unsplash.com/photo-1603487742131-4160ec999306?w=400&q=80"),
        ProductModel("Jaket Hoodie", "Rp 410.000", "https://images.unsplash.com/photo-1556821840-3a63f95609a7?w=400&q=80"),
        ProductModel("Speaker Bluetooth", "Rp 620.000", "https://images.unsplash.com/photo-1608043152269-423dbba4e7e1?w=400&q=80"),
        ProductModel("Tripod Kamera", "Rp 290.000", "https://images.unsplash.com/photo-1516724562728-afc824a36e84?w=400&q=80"),


        ProductModel("Action Camera", "Rp 1.750.000", "https://images.unsplash.com/photo-1526170375885-4d8ecf77b99f?w=400&q=80"),
        ProductModel("Smartphone Samsung", "Rp 4.500.000", "https://images.unsplash.com/photo-1511707171634-5f897ff02aa9?w=400&q=80"),
        ProductModel("Tablet Xiaomi", "Rp 3.250.000", "https://images.unsplash.com/photo-1544244015-0df4b3ffc6b0?w=400&q=80"),
        ProductModel("Laptop ASUS", "Rp 8.900.000", "https://images.unsplash.com/photo-1496181133206-80ce9b88a853?w=400&q=80"),
        ProductModel("Printer Epson", "Rp 2.350.000", "https://images.unsplash.com/photo-1612815154858-60aa4c59eaa6?w=400&q=80"),
        ProductModel("Flashdisk 64GB", "Rp 95.000", "https://images.unsplash.com/photo-1597872200969-2b65d56bd16b?w=400&q=80"),
        ProductModel("Harddisk External", "Rp 850.000", "https://images.unsplash.com/photo-1531492746076-161ca9bcad58?w=400&q=80"),
        ProductModel("Kursi Gaming", "Rp 1.950.000", "https://images.unsplash.com/photo-1598550476439-6847785fcea6?w=400&q=80"),
        ProductModel("Meja Kerja Minimalis", "Rp 1.450.000", "https://images.unsplash.com/photo-1518455027359-f3f8164ba6bd?w=400&q=80"),
        ProductModel("Lampu LED RGB", "Rp 175.000", "https://images.unsplash.com/photo-1550751827-4bd374c3f58b?w=400&q=80"),


        ProductModel("Kompor Portable", "Rp 230.000", "https://images.unsplash.com/photo-1584269600464-37b1b58a9fe7?w=400&q=80"),
        ProductModel("Blender Philips", "Rp 540.000", "https://images.unsplash.com/photo-1570222094114-d054a817e56b?w=400&q=80"),
        ProductModel("Rice Cooker", "Rp 480.000", "https://images.unsplash.com/photo-1585515320310-259814833e62?w=400&q=80"),
        ProductModel("Vacuum Cleaner", "Rp 1.250.000", "https://images.unsplash.com/photo-1558317374-067fb5f30001?w=400&q=80"),
        ProductModel("Dispenser Air", "Rp 780.000", "https://images.unsplash.com/photo-1548839140-29a749e1cf4d?w=400&q=80"),
        ProductModel("Botol Minum Tumbler", "Rp 110.000", "https://images.unsplash.com/photo-1602143407151-7111542de6e8?w=400&q=80"),
        ProductModel("Payung Lipat", "Rp 95.000", "https://images.unsplash.com/photo-1534309466160-70b22cc6252c?w=400&q=80"),
        ProductModel("Bantal Leher Travel", "Rp 85.000", "https://images.unsplash.com/photo-1584100936595-c0654b55a2e2?w=400&q=80"),
        ProductModel("Koper Kabin", "Rp 680.000", "https://images.unsplash.com/photo-1565026057447-bc90a3dceb87?w=400&q=80"),
        ProductModel("Sepeda Lipat", "Rp 3.800.000", "https://images.unsplash.com/photo-1532298229144-0ec0c57515c7?w=400&q=80"),


        ProductModel("Helm Full Face", "Rp 920.000", "https://images.unsplash.com/photo-1557804506-669a67965ba0?w=400&q=80"),
        ProductModel("Sarung Tangan Motor", "Rp 140.000", "https://images.unsplash.com/photo-1584735175315-9d5df23860e6?w=400&q=80"),
        ProductModel("Rak Buku Minimalis", "Rp 520.000", "https://images.unsplash.com/photo-1594620302200-9a762244a156?w=400&q=80"),
        ProductModel("Novel Best Seller", "Rp 98.000", "https://images.unsplash.com/photo-1544947950-fa07a98d237f?w=400&q=80"),
        ProductModel("Paket Alat Lukis", "Rp 350.000", "https://images.unsplash.com/photo-1513364776144-60967b0f800f?w=400&q=80"),
        ProductModel("Gitar Akustik", "Rp 1.600.000", "https://images.unsplash.com/photo-1510915361894-db8b60106cb1?w=400&q=80"),
        ProductModel("Piano Keyboard", "Rp 2.750.000", "https://images.unsplash.com/photo-1520523839897-bd0b52f945a0?w=400&q=80"),
        ProductModel("Drone Mini", "Rp 1.950.000", "https://images.unsplash.com/photo-1507582020474-9a35b7d455d9?w=400&q=80"),
        ProductModel("Smartwatch Xiaomi", "Rp 670.000", "https://images.unsplash.com/photo-1579586337278-3befd40fd17a?w=400&q=80"),
        ProductModel("Router WiFi", "Rp 430.000", "https://images.unsplash.com/photo-1544197150-b99a580bb7a8?w=400&q=80")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_tab_c, container, false)
        _binding = FragmentTabCBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ProductAdapter(productList) { selectedItem ->
            Toast.makeText(requireContext(), "Anda memilih ${selectedItem.name}", Toast.LENGTH_SHORT).show()
        }

        binding.rvProducts.apply {
            /** Mode Grid **/
            layoutManager = GridLayoutManager(requireContext(), 3)

            /** Jika ingin model Linear **/
            //layoutManager = LinearLayoutManager(requireContext())

            this.adapter = adapter
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}