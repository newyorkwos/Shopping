package com.bajiru.shoppingerp.controller;

import com.bajiru.shoppingerp.VO.ProductInfoVO;
import com.bajiru.shoppingerp.VO.ProductVO;
import com.bajiru.shoppingerp.VO.ResultVO;
import com.bajiru.shoppingerp.domain.ProductCategory;
import com.bajiru.shoppingerp.domain.ProductInfo;
import com.bajiru.shoppingerp.service.CategoryService;
import com.bajiru.shoppingerp.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description create buyer Controller
 * @AuthorName StevenWu
 * @CreateDateTime 2020-03-31-9:34 下午
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/list")
    public ResultVO list(){

        //1.查詢所有的上架商品
        List<ProductInfo> productInfoList=productService.findUpAll();

        //2.查詢類目(一次性查詢)
        List<Integer> categoryTypeList=productInfoList.stream()
                .map(e -> e.getProductCategory().getCategoryType())
                .collect(Collectors.toList());
        List<ProductCategory> productCategoryList= categoryService.findByCategoryTypeIn(categoryTypeList);
        //3.數據拼裝
        List<ProductVO> productVOList=new ArrayList<>();
        for(ProductCategory productCategory: productCategoryList){
            ProductVO productVO=new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList=new ArrayList<>();
            for(ProductInfo productInfo: productInfoList){
                if(productInfo.getProductCategory().getCategoryType().equals(productCategory.getCategoryType())){
                    ProductInfoVO productInfoVO=new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }
            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }
        ResultVO resultVO=new ResultVO();

        resultVO.setData(productVOList);
        resultVO.setCode(0);
        resultVO.setMsg("成功");


        return resultVO;
    }

}
